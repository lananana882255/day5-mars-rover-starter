package com.afs.tdd;

public class MarsRover {
    private int locationX;
    private int locationY;
    private Direction direction;

    public MarsRover(int initialLocationX,int initialLocationY,Direction initialDirection) {
        this.locationX=initialLocationX;
        this.locationY=initialLocationY;
        this.direction=initialDirection;
    }

    public int getLocationX() {
        return this.locationX;
    }
    public int getLocationY() {
        return this.locationY;
    }
    public Direction getDirection() {
        return this.direction;
    }
    private void increaseLocationX() {
        this.locationX+=1;
    }
    private void DecreaseLocationX() {
        this.locationX-=1;
    }
    private void increaseLocationY() {
        this.locationY+=1;
    }
    private void DecreaseLocationY() {
        this.locationY-=1;
    }

    public void executeCommand(String command) {
        if(command.equals("M")){
            move();
        }
        if(command.equals("L")){
            turnLeft();
        }
    }

    private void turnLeft() {
        if(this.direction==Direction.E){
            this.direction=Direction.N;
        }
        else if(this.direction==Direction.W){
            this.direction=Direction.S;
        }
        else if(this.direction==Direction.N){
            this.direction=Direction.W;
        }
        else if(this.direction==Direction.S){
            this.direction=Direction.E;
        }
    }

    private void move() {
        if(this.direction==Direction.E){
            increaseLocationX();
        }
        if(this.direction==Direction.W){
            DecreaseLocationX();
        }
        if(this.direction==Direction.N){
            increaseLocationY();
        }
        if(this.direction==Direction.S){
            DecreaseLocationY();
        }
    }
}
