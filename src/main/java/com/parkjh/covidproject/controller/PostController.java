package com.parkjh.covidproject.controller;

import com.parkjh.covidproject.dto.PostDto;
import com.parkjh.covidproject.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("/post")
public class PostController {

    private PostService postService;

    /* 게시글 목록 화면 */
    @GetMapping("/list")
    public String list() {
        System.out.println("???");
        return "post/list.html";
    }

    /* 게시글 작성 화면 */
    @GetMapping("/write")
    public String write() {
        return "post/write.html";
    }

    /* 게시글 작성 기능 */
    @PostMapping("/write")
    public String write(PostDto postDto) {
        postService.savePost(postDto);

        return "redirect:post/list";
    }
}
