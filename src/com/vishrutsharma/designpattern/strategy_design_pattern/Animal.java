package com.vishrutsharma.designpattern.strategy_design_pattern;

public class Animal {

    private String name;
    private double height;
    private int weight;
    private String favFood;
    private double speed;
    private String sound;

    public Flys flyingType;

    public void setName(String newName){ name = newName; }
    public String getName(){return name;}

    public double getHeight() {return height;}

    public void setHeight(double height) {this.height = height;}

    public int getWeight() {return weight;}

    public void setWeight(int weight) {
        if(weight >0){
            this.weight = weight;
        }else{
            System.out.println("wrong weight");
        }
    }

    public String getFavFood() {return favFood;}

    public void setFavFood(String favFood) {this.favFood = favFood;}

    public double getSpeed() {return speed;}

    public void setSpeed(double speed) {this.speed = speed;}

    public String getSound() {return sound;}

    public void setSound(String sound) {this.sound = sound;}


    public String tryToFly(){
        return flyingType.fly();
    }

    public void setFlyingAbility(Flys newFlyType){
        flyingType = newFlyType;
    }
}
