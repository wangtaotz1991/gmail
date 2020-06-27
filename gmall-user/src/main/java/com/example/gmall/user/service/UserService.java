package com.example.gmall.user.service;

import com.example.gmall.user.bean.UmsMember;
import com.example.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @author wangtao
 * @create 2020-06-27 15:19
 */
public interface UserService {
    public List<UmsMember> getAllUser();

    //public UmsMemberReceiveAddress getUReceiveAddressById(String memberId);

    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
