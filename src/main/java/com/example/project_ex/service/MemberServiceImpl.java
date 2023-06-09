package com.example.project_ex.service;

import com.example.project_ex.dao.MemberDAO;
import com.example.project_ex.dto.MemberDTO;
import com.example.project_ex.vo.MemberVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{


    private final MemberDAO memberDAO;
    private final ModelMapper modelMapper;


    @Override
    public boolean addMember(MemberDTO memberDTO) {
        log.info(modelMapper);
        MemberVO memberVO = modelMapper.map(memberDTO, MemberVO.class);
        memberDAO.insertMember(memberVO);
        log.info(memberVO);
        return true;
    }

    @Override
    public int login(String userId, String password) {
        MemberVO memberVO = memberDAO.getMemberById(userId);
        MemberDTO memberDTO = modelMapper.map(memberVO, MemberDTO.class);
        if(memberDTO.getPassword().equals(password)) {
            return memberDTO.getMid();
        }
        return Integer.parseInt(null);
    }


}
