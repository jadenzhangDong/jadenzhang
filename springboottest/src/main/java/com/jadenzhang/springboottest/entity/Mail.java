package com.jadenzhang.springboottest.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Mail {
    private Long id;
    private String subject;
    private String sendTo;
    private String content;
}
