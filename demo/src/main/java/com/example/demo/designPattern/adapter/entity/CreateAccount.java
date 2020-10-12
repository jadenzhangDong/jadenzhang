package com.example.demo.designPattern.adapter.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class CreateAccount {

    /**
     * 开户编号
     */
    private String number;

    /**
     * 开户地址
     */
    private String address;

    /**
     * 开户时间
     */
    private Date accountDate;

    /**
     * 开户描述
     */
    private String desc;
}
