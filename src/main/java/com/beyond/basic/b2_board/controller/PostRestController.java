package com.beyond.basic.b2_board.controller;


import com.beyond.basic.b2_board.domain.Post;
import com.beyond.basic.b2_board.dtos.*;
import com.beyond.basic.b2_board.service.MemberService;
import com.beyond.basic.b2_board.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/post/rest")
public class PostRestController {
    private final PostService postService;
    private final MemberService memberService;

    public PostRestController(PostService postService, MemberService memberService) {
        this.postService = postService;
        this.memberService = memberService;
    }

    @GetMapping("/list")
    public ResponseEntity<?> postList(){
        List<PostListRes> list = postService.findAll();
        return new ResponseEntity<>(new CommonDto(HttpStatus.OK.value(), "글 목록 입니다.",list), HttpStatus.OK);

    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<?> postDetail(@PathVariable Long id){
        PostDetailDto postDetailDto = postService.findById(id);
        return new ResponseEntity<>(new CommonDto(HttpStatus.OK.value(),"post's detail", postDetailDto), HttpStatus.OK);

    }

    @PostMapping("/create")
//    Valid와 NotEmpty 등 검증 어노테이션이 한쌍.
    public ResponseEntity<?> postCreate(@Valid @RequestBody PostCreateDto postCreateDto){
        postService.save(postCreateDto);
        return new ResponseEntity<>(new CommonDto(HttpStatus.CREATED.value(), "post is created", postCreateDto), HttpStatus.CREATED);

    }


}
