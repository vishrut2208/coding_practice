package com.vishrutsharma.designpattern.strategy_design_pattern;

public class Bird extends Animal{

    public Bird(){
        super();
        setSound("Tweet");

        flyingType = new ItsFlys();
    }
}
