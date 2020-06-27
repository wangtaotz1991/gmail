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

    @RequestMapping("queryUmsMemberReceiveAddress")
    @ResponseBody
    public List<UmsMemberReceiveAddress> queryUmsMemberReceiveAddress(UmsMemberReceiveAddress umsMemberReceiveAddress){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddressList = userService.queryUmsMemberReceiveAddress(umsMemberReceiveAddress);
        return umsMemberReceiveAddressList;
    }

    @RequestMapping("addUmsMemberReceiveAddress")
    @ResponseBody
    public boolean addUmsMemberReceiveAddress(UmsMemberReceiveAddress umsMemberReceiveAddress){
        boolean flag = userService.addUmsMemberReceiveAddress(umsMemberReceiveAddress);
        return flag;
    }

    @RequestMapping("delUmsMemberReceiveAddress")
    @ResponseBody
    public boolean delUmsMemberReceiveAddress(UmsMemberReceiveAddress umsMemberReceiveAddress){
        boolean flag = userService.delUmsMemberReceiveAddress(umsMemberReceiveAddress);
        return flag;
    }

    @RequestMapping("updUmsMemberReceiveAddress")
    @ResponseBody
    public boolean updUmsMemberReceiveAddress(UmsMemberReceiveAddress umsMemberReceiveAddress){
        boolean flag = userService.updUmsMemberReceiveAddress(umsMemberReceiveAddress);
        return flag;
    }


    @RequestMapping("queryUmsMember")
    @ResponseBody
    public List<UmsMember> queryUmsMember(UmsMember umsMember){
        List<UmsMember> umsMemberList = userService.queryUmsMember(umsMember);
        return umsMemberList;
    }

    @RequestMapping("addUmsMember")
    @ResponseBody
    public boolean addUmsMember(UmsMember umsMember){
        boolean flag = userService.addUmsMember(umsMember);
        return flag;
    }

    @RequestMapping("delUmsMember")
    @ResponseBody
    public boolean delUmsMember(UmsMember umsMember){
        boolean flag = userService.delUmsMember(umsMember);
        return flag;
    }

    @RequestMapping("updUmsMember")
    @ResponseBody
    public boolean updUmsMember(UmsMember umsMember){
        boolean flag = userService.updUmsMember(umsMember);
        return flag;
    }


}
