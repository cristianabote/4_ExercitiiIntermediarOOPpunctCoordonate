package com.company;

import java.util.Scanner;

public class PunctDoiD {
    private float x;
    private  float y;
    public PunctDoiD(float x, float y){
        this.x=x;
        this.y=y;
    }
    public void setX(float x){
        this.x=x;
    }
    public void setY(float y){
        this.y=y;
    }
    public float getX(){
        return this.x;
    }
    public float getY(){
        return this.y;
    }
    public void modifyCoordinates(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Modificati coordonatele: ");
        float xModify = scan.nextFloat();
        float yModify = scan.nextFloat();
    setX(xModify);
    setY(yModify);

    }
    public void printCoordinates(){
        System.out.println("Coordonatele sunt: ("+x+", "+y+")");
    }
}
