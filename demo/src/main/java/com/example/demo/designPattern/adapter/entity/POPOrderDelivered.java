package com.example.demo.designPattern.adapter.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
public class POPOrderDelivered {

    private String uId;     // 用户ID
    private String orderId; // 订单号
    private Date orderTime; // 下单时间
    private Date sku;       // 商品
    private Date skuName;   // 商品名称
    private BigDecimal decimal; // 金额
}
