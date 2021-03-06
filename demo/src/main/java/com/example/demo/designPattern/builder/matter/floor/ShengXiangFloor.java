package com.example.demo.designPattern.builder.matter.floor;

import com.example.demo.designPattern.builder.matter.Matter;

import java.math.BigDecimal;

public class ShengXiangFloor implements Matter {
    @Override
    public String scene() {
        return "地板";
    }

    @Override
    public String brand() {
        return "圣象";
    }

    @Override
    public String model() {
        return "一级";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(318);
    }

    @Override
    public String desc() {
        return "中国著名品牌";
    }
}
