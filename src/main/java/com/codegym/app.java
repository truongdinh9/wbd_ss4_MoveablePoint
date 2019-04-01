package com.codegym;

public class app {
    public static void main(String[] args) {
        MovablePoint movablePoint1=new MovablePoint(1,2,3,4);
        MovablePoint movablePoint2=new MovablePoint(1,2,3,4);
        movablePoint1.move();
        movablePoint2.move();
        System.out.println(movablePoint1);
        System.out.println(movablePoint2);

    }
}
