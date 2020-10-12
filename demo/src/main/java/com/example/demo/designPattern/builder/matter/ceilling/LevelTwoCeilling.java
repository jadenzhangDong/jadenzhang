package com.example.demo.designPattern.builder.matter.ceilling;

import com.example.demo.designPattern.builder.matter.Matter;

import java.math.BigDecimal;

public class LevelTwoCeilling implements Matter {
    @Override
    public String scene() {
        return "吊顶";
    }

    @Override
    public String brand() {
        return "装修公司自带";
    }

    @Override
    public String model() {
        return "二级顶";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(850);
    }

    @Override
    public String desc() {
        return "两个层次的吊顶，二级吊顶高度一般往下20cm，要是层次很高，也可以增加每级的厚度";
    }
}
