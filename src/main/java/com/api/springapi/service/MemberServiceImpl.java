package com.api.springapi.service;

import com.api.springapi.dao.MemberDao;
import com.api.springapi.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl {

    @Autowired
    MemberDao memberDao;

    public List<MemberVO> selectAllMembers() {
        return memberDao.selectAllMembers();
    }
}
