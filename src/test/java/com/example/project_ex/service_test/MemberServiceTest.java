package com.example.project_ex.service_test;

import com.example.project_ex.dao.MemberDAO;
import com.example.project_ex.dto.MemberDTO;
import com.example.project_ex.service.MemberService;
import com.example.project_ex.service.MemberServiceImpl;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.Model;

import java.time.LocalDate;

@SpringBootTest
@Log4j2
public class MemberServiceTest {

    @Autowired
    private MemberServiceImpl memberService;

    @Test
    public void addMemberTest() {
        MemberDTO memberDTO = MemberDTO.builder()
                .userId("service")
                .password("password123")
                .nickName("service123")
                .name("service1")
                .birthDate(LocalDate.of(2000,01,01))
                .gender("여")
                .phoneNumber("01012345078")
                .email("service@example.com")
//                .zipcode("12345")
//                .address("123 Main St, Anytown USA")
//                .socialLogin(false)
//                .isAdmin(false)
                .build();
        log.info(memberDTO);
        boolean result = memberService.addMember(memberDTO);
        Assertions.assertTrue(result);
    }

    @Test
    public void loginTest() {
        memberService.login("aaaa","1234");
//        log.info();

    }
}
