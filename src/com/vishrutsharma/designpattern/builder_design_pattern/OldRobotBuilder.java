package com.vishrutsharma.designpattern.builder_design_pattern;

public class OldRobotBuilder implements RobotBuilder {

    private Robot robot;

    public OldRobotBuilder(){
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Tin Head");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("Tin Torso");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("BlowTorch Arms");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("Roller Skates");
    }

    public Robot getRobot(){
        return this.robot;
    }
}
