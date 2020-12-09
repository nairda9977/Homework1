package com.solvd.auto.body;

public class Cabrio extends Open {
    private int height;
    private int width;
    private int weight;
    private int openTime;

    public Cabrio (){

    }
    public  Cabrio (int height1, int width1, int weight1){
        height=height1;
        width=width1;
        weight=weight1;
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
    public void setOpenTime(int openTime1){
        openTime=openTime1;
    }
    public int getOpenTime(){
        return openTime;
    }

    public void printFields(){
        System.out.println("Height = " + height+" cm");
        System.out.println("Width = " + width+" cm");
        System.out.println("Weight = " + weight+ " kg ");
        System.out.println("Open time = " + openTime+" sec");
        System.out.println("Color = "+ color);
    }

}
