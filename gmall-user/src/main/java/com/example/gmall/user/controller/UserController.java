package com.example.gmall.user.controller;

import com.example.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wangtao
 * @create 2020-06-27 15:18
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("idex")
    @ResponseBody
    public String idex(){
        return "Hello idex";
    }

}
