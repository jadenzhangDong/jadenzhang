package com.example.demo.designPattern.builder.matter.coat;

import com.example.demo.designPattern.builder.matter.Matter;

import java.math.BigDecimal;

public class DuluxCoat implements Matter {
    @Override
    public String scene() {
        return "涂料";
    }

    @Override
    public String brand() {
        return "多乐士";
    }

    @Override
    public String model() {
        return "第二代";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(719);
    }

    @Override
    public String desc() {
        return "多乐士是畅销的装饰材料";
    }
}
