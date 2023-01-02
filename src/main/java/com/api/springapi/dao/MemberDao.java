package com.api.springapi.dao;

import com.api.springapi.vo.MemberVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberDao {

    public List<MemberVO> selectAllMembers();
}
