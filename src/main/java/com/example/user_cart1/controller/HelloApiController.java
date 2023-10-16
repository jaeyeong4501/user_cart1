package com.example.user_cart1.controller;


import com.example.user_cart1.jwt.util.JwtTokenizer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloApiController {
    private final JwtTokenizer jwtTokenizer;

    @GetMapping("/hello")
    public String hello(@RequestHeader("Authorization") String token) {
        Long memberIdFormToken = jwtTokenizer.getMemberIdFromToken(token);
        return "hello " + memberIdFormToken;
    }
}
