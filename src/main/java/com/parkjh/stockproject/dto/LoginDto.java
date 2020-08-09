package com.parkjh.stockproject.dto;

import com.parkjh.stockproject.domain.entity.LoginEntity;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class LoginDto {
    private Long id;
    private String email;
    private String password;
    private char adminYn;
    private char delYn;
    private String regUser;
    private LocalDateTime regDate;
    private String updUser;
    private LocalDateTime updDate;

    public LoginEntity toEntity() {
        return LoginEntity.builder()
                .id(id)
                .email(email)
                .password(password)
                .adminYn(adminYn)
                .delYn(delYn)
                .regUser(regUser)
                .updUser(updUser)
                .build();
    }

    @Builder
    public LoginDto(Long id, String email, String password, char adminYn, char delYn, String regUser, LocalDateTime regDate, String updUser, LocalDateTime updDate) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.adminYn = adminYn;
        this.delYn = delYn;
        this.regUser = regUser;
        this.regDate = regDate;
        this.updUser = updUser;
        this.updDate = updDate;
    }
}