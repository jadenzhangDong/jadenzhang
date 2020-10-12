package com.example.demo.designPattern.adapter.adapterentity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter@Setter
public class RebateInfo {

    private String userId;  // 用户ID
    private String bizId;   // 业务ID
    private Date bizTime;   // 业务时间
    private String desc;    // 业务描述
}
