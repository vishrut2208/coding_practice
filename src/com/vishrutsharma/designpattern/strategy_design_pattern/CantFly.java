package com.vishrutsharma.designpattern.strategy_design_pattern;

public class CantFly implements Flys {
    @Override
    public String fly() {
        return "I can't fly";
    }
}
