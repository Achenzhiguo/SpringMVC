package com.czg.controller;

import com.czg.pojo.VipUser;
import com.czg.service.VipUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: erdongchen
 * @Date: 2022/5/5 - 05 - 05 - 20:57
 * @Description: com.czg.controller
 * @version: 1.0
 */

@Controller
public class VipUserController {
    @Autowired
    private VipUserService vipUserService;

    @RequestMapping("/login")
    public String login(String name,String password){
        String view =null;
        VipUser user = vipUserService.findUser(name, password);
        if (null!=user){
            view = "/success.jsp";
        }else {
            view = "/fail.jsp";
        }
        return view;
    }
    @RequestMapping("/login2")
    public String login(){
        System.out.println("欢迎登录");
        return "login.jsp";
    }
}
