package com.parkjh.stockproject.service;

import com.parkjh.stockproject.domain.repository.PostRepository;
import com.parkjh.stockproject.dto.PostDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class PostService {

    private PostRepository postRepository;

    /* 게시글 저장 */
    @Transactional
    public Long savePost(PostDto postDto) {
        return postRepository.save(postDto.toEntity()).getId();
    }
}
