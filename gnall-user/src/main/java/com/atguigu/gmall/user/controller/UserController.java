package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    // springboot 测试
    @RequestMapping("hello")
    @ResponseBody
    public String hello() {
        return "hello SpringTest!!!";
    }


    // 获取所有user集合
    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers = userService.getAllUser();
        return umsMembers;
    }

    // 根据userMemberId获取用户相关地址信息
    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(@RequestParam("memberId") String memberId) {
        List<UmsMemberReceiveAddress> receiveAddressList = userService.getReceiveAddressByMemberId(memberId);
        return receiveAddressList;
    }



}
