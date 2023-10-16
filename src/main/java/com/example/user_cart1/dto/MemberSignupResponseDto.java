package com.example.user_cart1.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MemberSignupResponseDto {
    private Long memberId;
    private String email;
    private String name;
    private LocalDateTime regdate;
}
