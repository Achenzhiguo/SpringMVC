package com.czg.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @Auther: erdongchen
 * @Date: 2022/5/8 - 05 - 08 - 18:46
 * @Description: com.czg.controller
 * @version: 1.0
 */
@Controller
public class Icontroller {

    private static final String FILESERVE = "http://192.168.1.101:8090/upload/";

    @ResponseBody
    @RequestMapping("fileUpload.do")
    public Map<String, String> fileUpload(MultipartFile headPhoto, HttpServletRequest req) throws IOException {
        Map<String,String> map = new HashMap<>();
            //控制上传的文件大小
      /*  if (headPhoto.getSize()>(1024*300)){
            map.put("message","照片不能大于300kb");
            return map;
        }
*/
        // 获取文件名
        String originalFilename = headPhoto.getOriginalFilename();
        // 避免文件名冲突,使用UUID替换文件名
        String uuid = UUID.randomUUID().toString();
        // 获取拓展名
        String extendsName = originalFilename.substring(originalFilename.lastIndexOf("."));//以最后偶一个点截取,找到文件类型

       /*     //控制文件类型
        if(!extendsName.equals(".jpg")){
            map.put("message","图片格式只能为JPG格式");
            return map;
        }
*/
        // 新的文件名
        String newFileName=uuid.concat(extendsName);//将文件名与文件格式拼接

        // 创建 sun公司提供的jersey包中的client对象
        Client client = Client.create();
        WebResource resource = client.resource(FILESERVE + newFileName);
        //把文件保存到另一台服务器上
        resource.put(String.class,headPhoto.getBytes());

        //上传成功后把文件名和文件类型响应给浏览器
        map.put("message","上传成功");
        map.put("newFileName",newFileName);
        map.put("filetype",headPhoto.getContentType());
        /*System.out.println(headPhoto.getContentType());*/


        return map;
    }


}
