package com.example.demo.designPattern;

import com.example.demo.designPattern.builder.design.Builder;
import org.junit.jupiter.api.Test;

public class BuilderTest {

    @Test
    void test_builder() {
        Builder builder = new Builder();
        System.out.println(builder.levelOne(132.52D).getDetail());
        System.out.println(builder.levelTwo(98.25D).getDetail());
        System.out.println(builder.levelThree(85.43D).getDetail());
    }
}
