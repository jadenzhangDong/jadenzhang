package com.example.demo.designPattern.builder.matter.coat;

import com.example.demo.designPattern.builder.matter.Matter;

import java.math.BigDecimal;

public class LiBangCoat implements Matter {
    @Override
    public String scene() {
        return "涂料";
    }

    @Override
    public String brand() {
        return "立邦";
    }

    @Override
    public String model() {
        return "默认级别";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(650);
    }

    @Override
    public String desc() {
        return "立邦是绿色产品";
    }
}
