package com.vishrutsharma.designpattern.builder_design_pattern;

public interface RobotBuilder {

    public void buildRobotHead();
    public void buildRobotTorso();
    public void buildRobotArms();
    public void buildRobotLegs();
    public Robot getRobot();
}
