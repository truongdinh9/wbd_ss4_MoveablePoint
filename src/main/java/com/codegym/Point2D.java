package com.codegym;

import java.util.Arrays;

public class Point2D {
    private float x=0.0f;
    private float y=0.0f;

    Point2D(){};
    Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    float getX() {
        return x;
    }

    void setX(float x) {
        this.x = x;
    }

    float getY() {
        return y;
    }

    void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }
    float[] getXY(){
        return new float[]{getX(),getY()};
    }

    @Override
    public String toString() {
        return Arrays.toString(getXY());
    }
}

