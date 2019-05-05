package com.vishrutsharma.designpattern.strategy_design_pattern;

public class AnimalPlay {

    public static void main(String[] args) {
        Animal sparky = new Dog();
        Animal tweety = new Bird();

        System.out.println("Dog: " + sparky.tryToFly());
        System.out.println("Bird: " + tweety.tryToFly());

        sparky.setFlyingAbility(new ItsFlys());
        System.out.println("Dog: " + sparky.tryToFly());
    }
}
