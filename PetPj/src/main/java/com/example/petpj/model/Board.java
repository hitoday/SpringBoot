package com.example.petpj.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Board {
    private Long seq;
    private String title;
    private String writer;
    private String content;
    private Date CreateDate;
    private Long cnt;
}
