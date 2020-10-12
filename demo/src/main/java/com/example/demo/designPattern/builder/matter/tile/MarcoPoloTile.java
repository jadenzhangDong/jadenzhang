package com.example.demo.designPattern.builder.matter.tile;

import com.example.demo.designPattern.builder.matter.Matter;

import java.math.BigDecimal;

public class MarcoPoloTile implements Matter {
    @Override
    public String scene() {
        return "地砖";
    }

    @Override
    public String brand() {
        return "马可波罗";
    }

    @Override
    public String model() {
        return "缺省";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(140);
    }

    @Override
    public String desc() {
        return "中国最早的建陶品牌";
    }
}
