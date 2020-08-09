package com.parkjh.stockproject.controller;

import com.parkjh.stockproject.dto.LoginDto;
import com.parkjh.stockproject.service.LoginService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping(value = "/login")
public class LoginController {

    private LoginService loginService;

    // 로그인 페이지
    @GetMapping("/login")
    public String login() {
        return "login/login";
    }

    // 회원가입 페이지
    @GetMapping("/signUp")
    public String signUp() {
        return "login/signUp";
    }

    // 회원가입 처리
    @PostMapping("/signUp")
    public String signUp(LoginDto loginDto) {
        loginService.joinUser(loginDto);

        return "redirect:login/login";
    }

    // 로그인 결과 페이지
    @GetMapping("/loginResult")
    public String loginResult() {
        return "login/loginResult";
    }

    // 로그아웃 결과 페이지
    @GetMapping("/logoutResult")
    public String logoutResult() {
        return "login/logoutResult";
    }

    // 접근 거부 페이지
    @GetMapping("/deniedAccess")
    public String deniedAccess() {
        return "login/deniedAccess";
    }

    // 내 정보 페이지
    @GetMapping("/myInfo")
    public String myInfo() {
        return "login/myinfo";
    }

    // 어드민 페이지
    @GetMapping("/admin")
    public String admin() {
        return "login/admin";
    }
}
