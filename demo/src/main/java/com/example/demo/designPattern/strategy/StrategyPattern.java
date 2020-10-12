package com.example.demo.designPattern.strategy;

import javax.lang.model.element.VariableElement;
import java.util.HashMap;

public class StrategyPattern {
    public static void main(String[] args) {
        Context c = new Context();
        Strategy s = new ConcreteStrategyA();
        c.setStrategy(s);
        c.strategyMethod();
        System.out.println("-------------");
        s = new ConcreteStrategyB();
        c.setStrategy(s);
        c.strategyMethod();
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put(new Object(), new Object());
    }
}
/**
 * 抽象策略类
 */
interface Strategy{
    public void strategymethod();
}

/**
 *  具体策略类A
 */
class ConcreteStrategyA implements Strategy{

    @Override
    public void strategymethod() {
        System.out.println("具体策略的策略方法A被访问");
    }
}

/**
 *  具体策略类B
 */
class ConcreteStrategyB implements Strategy{

    @Override
    public void strategymethod() {
        System.out.println("具体策略的策略方法B被访问");
    }
}
/**
 * 环境类
 */
class Context{
    private Strategy strategy;

    public Strategy getStrategy(){
        return strategy;
    }

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public void strategyMethod(){
        strategy.strategymethod();
    }
}