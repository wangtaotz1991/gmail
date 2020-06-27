package com.example.gmall.user.service.impl;

import com.example.gmall.user.bean.UmsMember;
import com.example.gmall.user.bean.UmsMemberReceiveAddress;
import com.example.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.example.gmall.user.mapper.UserMapper;
import com.example.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangtao
 * @create 2020-06-27 15:19
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMemberList =  userMapper.selectAll();
        return umsMemberList;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(Long.valueOf(memberId));
        List<UmsMemberReceiveAddress> umsMemberReceiveAddressList= umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
        return umsMemberReceiveAddressList;
    }

/*    @Override
    public UmsMemberReceiveAddress getUReceiveAddressById(String memberId) {
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setId(Long.valueOf(memberId));
        umsMemberReceiveAddress = umsMemberReceiveAddressMapper.selectByPrimaryKey(umsMemberReceiveAddress);
        return umsMemberReceiveAddress;
    }*/
}
