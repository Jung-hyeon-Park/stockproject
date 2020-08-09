package com.parkjh.stockproject.domain.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "T_POSTS")
public class PostEntity extends TimeEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(length = 150, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    @Column(length = 1, nullable = false)
    @ColumnDefault("N")
    private char delYn;

    @Column(length = 10, nullable = false)
    @ColumnDefault("0")
    private int hit;

    @Column(length = 100, nullable = false)
    private String regUser;

    @Column(length = 100, nullable = false)
    private String updUser;

    @Builder
    public PostEntity(Long id, String title, String content, char delYn, int hit, String regUser, String updUser) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.delYn = delYn;
        this.hit = hit;
        this.regUser = regUser;
        this.updUser = updUser;

    }
}
