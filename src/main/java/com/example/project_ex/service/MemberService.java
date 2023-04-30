package com.example.project_ex.service;

import com.example.project_ex.dto.MemberDTO;
import com.example.project_ex.dao.MemberDAO;
import com.example.project_ex.vo.MemberVO;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MemberService {

    boolean addMember(MemberDTO memberDTO);

    int login(String userId, String password);

//    public boolean updateMember(MemberDTO memberDTO) {
//        return memberMapper.updateMember(memberDTO);
//    }
//
//    public boolean deleteMember(int mid) {
//        return memberMapper.deleteMember(mid);
//    }
//
//    public MemberVO selectOneMember(int mid) {
//        return memberMapper.selectOneMember(mid);
//    }
//
//    public List<MemberVO> selectAllMembers() {
//        return memberMapper.selectAllMembers();
//    }
//
//    public boolean checkUserId(String userId) {
//        return memberMapper.checkUserId(userId);
//    }
//
//    public boolean checkNickName(String nickName) {
//        return memberMapper.checkNickName(nickName);
//    }
//
//    public MemberVO selectOneMemberByUserId(String userId) {
//        return memberMapper.selectOneMemberByUserId(userId);
//    }
//

}