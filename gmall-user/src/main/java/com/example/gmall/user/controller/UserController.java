package com.example.gmall.user.controller;

import com.example.gmall.user.bean.UmsMember;
import com.example.gmall.user.bean.UmsMemberReceiveAddress;
import com.example.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMemberList = userService.getAllUser();
        return umsMemberList;
    }

    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddressList = userService.getReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddressList;
    }


}
