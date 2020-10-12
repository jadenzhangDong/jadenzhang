package com.example.demo.designPattern.builder.matter.floor;

import com.example.demo.designPattern.builder.matter.Matter;

import java.math.BigDecimal;

public class DerFloor implements Matter {
    @Override
    public String scene() {
        return "地板";
    }

    @Override
    public String brand() {
        return "德尔";
    }

    @Override
    public String model() {
        return "A+";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(119);
    }

    @Override
    public String desc() {
        return "全球地板制造商";
    }
}
