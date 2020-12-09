package com.solvd.auto.body;

public class Van extends Trucks {
    private int height;
    private int width;
    private int weight;
    protected int trunk;

    public Van(){

    }
    public Van (int height1, int width1, int weight1){
        height=height1;
        width=width1;
        weight=weight1;
    }
    public void setTrunk(int trunk1){
        trunk=trunk1;
    }
    public int getTrunk(){
        return trunk;
    }
    public void setHeight(int height2){
        height=height2;
    }
    public int getHeight(){
        return height;
    }
    public void setWidth(int width2){
        width=width2;
    }
    public int getWidth(){
        return width;
    }
    public void setWeight(int weight2){
        weight=weight2;
    }
    public int getWeight(){
        return weight;
    }
    public void printFields(){
        System.out.println("Height = " + height+" cm");
        System.out.println("Width = " + width+" cm");
        System.out.println("Weight = " + weight+ " kg ");
        System.out.println("Trunk(багажник)= "+ trunk+" Liters");
    }
}
