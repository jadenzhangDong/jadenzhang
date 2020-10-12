package com.example.demo.designPattern.adapter.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PopOrderService {
    private Logger logger = LoggerFactory.getLogger(PopOrderService.class);

    public boolean isFirstOrder(String uId) {
        logger.info("POP商家，查询用户的订单是否为首单：{}", uId);
        return true;
    }
}
