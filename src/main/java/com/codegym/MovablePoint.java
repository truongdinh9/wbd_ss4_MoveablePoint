package com.codegym;

import java.util.Arrays;

public class MovablePoint extends Point2D {
    float xSpeed =0;
    float ySpeed=0;
    MovablePoint(){}

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        return new float[]{getxSpeed(),getySpeed()};
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed=xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "[x,y]= "+Arrays.toString(getXY())+", speed=[xs,ys]= "+ Arrays.toString(getSpeed());

    }
    void move(){
        setX(getX()+getxSpeed());
        setY(getY()+getySpeed());
    }
    public void move1(){
        setX(getX()+getxSpeed());
        setY(getY()+getySpeed());
    }

    //    com.codegym.MovablePoint(float x,float y,float xSpeed,float)

}
