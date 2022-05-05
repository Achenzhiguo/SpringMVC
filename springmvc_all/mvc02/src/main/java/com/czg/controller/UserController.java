package com.czg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: erdongchen
 * @Date: 2022/5/5 - 05 - 05 - 20:19
 * @Description: com.czg.controller
 * @version: 1.0
 */
@Controller
public class UserController {

    @RequestMapping("/first.do")
    public String myFirst(){
        System.out.println("I am Comming");
        return "first.jsp";
    }

}
