package com.vishrutsharma.designpattern.prototype_design_pattern;

public class CloneFactory {

    public Animal getClone(Animal animalSample){
     return animalSample.makeCopy();
    }
}
