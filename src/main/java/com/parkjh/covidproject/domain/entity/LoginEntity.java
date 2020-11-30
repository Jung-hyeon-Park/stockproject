package com.parkjh.covidproject.domain.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "T_USER")
public class LoginEntity extends TimeEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String email;

    @Column(length = 300, nullable = false)
    private String password;

    @Column(length = 1, nullable = false)
    @ColumnDefault("N")
    private char adminYn;

    @Column(length = 1, nullable = false)
    @ColumnDefault("N")
    private char delYn;

    @Column(length = 100, nullable = false)
    private String regUser;

    @Column(length = 100, nullable = false)
    private String updUser;

    @Builder
    public LoginEntity(Long id, String email, String password, char adminYn, char delYn, String regUser, String updUser) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.adminYn = adminYn;
        this.delYn = delYn;
        this.regUser = regUser;
        this.updUser = updUser;
    }
}