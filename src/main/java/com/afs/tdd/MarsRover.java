package com.afs.tdd;

public class MarsRover {
    private Location location;
    public static final String MOVE = "M";
    public static final String TURN_LEFT = "L";
    public static final String TURN_RIGHT = "R";
    public static final String BACKWARD = "B";

    public MarsRover(int initialLocationX,int initialLocationY,Direction initialDirection) {
        this.location=new Location(initialLocationX,initialLocationY,initialDirection);
    }

    public int getLocationX() {
        return this.location.getLocationX();
    }
    public int getLocationY() {
        return this.location.getLocationY();
    }
    public Direction getDirection() {
        return this.location.getDirection();
    }

    public  void executeBatchOfCommands(String batchOfCommands){
        String[] commands = batchOfCommands.split("");
        for(String command : commands){
            executeCommand(command);
        }
    }

    public void executeCommand(String command) {
        switch (command) {
            case MOVE -> move();
            case TURN_LEFT -> turnLeft();
            case TURN_RIGHT -> turnRight();
            case BACKWARD -> backward();
            default -> throw new IllegalArgumentException("Invalid command: " + command + ". Only M, L, R, B are supported.");
        }
    }

    private void backward() {
        this.location.backward();
    }

    private void turnRight() {
        this.location.turnRight();
    }

    private void turnLeft() {
        this.location.turnLeft();
    }

    private void move() {
        this.location.move();
    }
}
