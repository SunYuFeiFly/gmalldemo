package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    // 根据用户id(menberId)获取用户相关收货地址
    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);

    // 获取所有用户列表
    List<UmsMember> getAllUser();
}
