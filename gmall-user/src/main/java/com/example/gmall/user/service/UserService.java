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

    public List<UmsMemberReceiveAddress> queryUmsMemberReceiveAddress(UmsMemberReceiveAddress umsMemberReceiveAddress);

    public boolean addUmsMemberReceiveAddress(UmsMemberReceiveAddress umsMemberReceiveAddress);

    public boolean delUmsMemberReceiveAddress(UmsMemberReceiveAddress umsMemberReceiveAddress);

    public boolean updUmsMemberReceiveAddress(UmsMemberReceiveAddress umsMemberReceiveAddress);

    public List<UmsMember> queryUmsMember(UmsMember umsMember);

    public boolean addUmsMember(UmsMember umsMember);

    public boolean delUmsMember(UmsMember umsMember);

    public boolean updUmsMember(UmsMember umsMember);
}
