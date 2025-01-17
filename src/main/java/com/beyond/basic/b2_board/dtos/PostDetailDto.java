package com.beyond.basic.b2_board.dtos;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Builder
public class PostDetailDto {
    private Long id;
    private String title;
    private String contents;
    private String memberEmail;
}
