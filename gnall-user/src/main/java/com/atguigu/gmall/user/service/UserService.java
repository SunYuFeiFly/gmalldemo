package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    // 获取所有user集合
    List<UmsMember> getAllUser();

    // 根据userMemberId获取用户相关地址信息
    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
