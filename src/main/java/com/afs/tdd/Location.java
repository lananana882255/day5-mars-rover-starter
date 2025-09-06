package com.afs.tdd;

public class Location {
    private int locationX;
    private int locationY;
    private Direction direction;

    public Location(int locationX, int locationY, Direction direction) {
        this.locationX=locationX;
        this.locationY=locationY;
        this.direction=direction;
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

    private void decreaseLocationX() {
        this.locationX-=1;
    }

    private void increaseLocationY() {
        this.locationY+=1;
    }

    private void decreaseLocationY() {
        this.locationY-=1;
    }

    public void turnLeft() {
        switch (this.direction) {
            case N -> this.direction=Direction.W;
            case S -> this.direction=Direction.E;
            case E -> this.direction=Direction.N;
            case W -> this.direction=Direction.S;
        };
    }
    public void turnRight() {
        switch (this.direction) {
            case N -> this.direction=Direction.E;
            case S -> this.direction=Direction.W;
            case E -> this.direction=Direction.S;
            case W -> this.direction=Direction.N;
        };
    }

    public void backward() {
        switch (direction) {
            case E -> decreaseLocationX();
            case W -> increaseLocationX();
            case N -> decreaseLocationY();
            case S -> increaseLocationY();
        }
    }

    public void move() {
        switch (direction) {
            case E -> increaseLocationX();
            case W -> decreaseLocationX();
            case N -> increaseLocationY();
            case S -> decreaseLocationY();
        }
    }
}

