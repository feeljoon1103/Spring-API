package com.api.springapi.controller;

import com.api.springapi.service.MemberServiceImpl;
import com.api.springapi.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {

    @Autowired
    MemberServiceImpl memberService;

    @GetMapping("/members")
    public @ResponseBody List<MemberVO> selectListMembers() {
        List<MemberVO> allMembers = memberService.selectAllMembers();

        return allMembers;
    }
}
