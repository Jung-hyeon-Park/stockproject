package com.parkjh.covidproject.dto;

import com.parkjh.covidproject.domain.entity.PostEntity;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class PostDto {

    private Long id;
    private String title;
    private String content;
    private char delYn;
    private int hit;
    private String regUser;
    private LocalDateTime regDate;
    private String updUser;
    private LocalDateTime updDate;

    public PostEntity toEntity(){
        PostEntity boardEntity = PostEntity.builder()
                .id(id)
                .title(title)
                .content(content)
                .delYn(delYn)
                .hit(hit)
                .regUser(regUser)
                .updUser(updUser)
                .build();
        return boardEntity;
    }

    @Builder
    public PostDto(Long id, String title, String content, char delYn, int hit, String regUser, LocalDateTime regDate, String updUser, LocalDateTime updDate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.delYn = delYn;
        this.hit = hit;
        this.regUser = regUser;
        this.regDate = regDate;
        this.updUser = updUser;
        this.updDate = updDate;
    }
}
