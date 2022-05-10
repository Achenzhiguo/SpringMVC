package com.czg.controller;

import com.czg.pojo.Iuser;
import com.czg.service.Iservice;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
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
public class addController {
    @Autowired
    private Iservice iservice;

    @RequestMapping("addIuser")
    public String addIuser(Iuser iuser){
        iservice.addIuser(iuser);
    /*    System.out.println(iuser);*/
        return "redirect:/showIuser.jsp";
    }



}
