package com.czg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @Auther: erdongchen
 * @Date: 2022/5/8 - 05 - 08 - 18:46
 * @Description: com.czg.controller
 * @version: 1.0
 */
@Controller
public class Icontroller {

    @ResponseBody
    @RequestMapping("fileUpload.do")
    public String addPlayer(MultipartFile headPhoto) throws IOException {
        //已经拿到图片相关的信息
        //文件保存的路径
        File dir = new File("D:/imgs");
        //获取文件名
        String originalFilename = headPhoto.getOriginalFilename();
        //文件储存位置
        File file = new File(dir,originalFilename);
        //文件保存
        headPhoto.transferTo(file);
        return "OK";
    }


}
