package com.czg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: erdongchen
 * @Date: 2022/5/4 - 05 - 04 - 23:21
 * @Description: com.czg.controller
 * @version: 1.0
 */
@Controller
public class MyController {

    @RequestMapping("/first.do")
    public String text1(){
        System.out.println("Hello World");
        System.out.println("shanyuanyin");

        return "first.jsp";
    }

}
