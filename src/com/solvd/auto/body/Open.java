package com.solvd.auto.body;

public class Open extends Body{
    private int height;
    private int width;
    private int weight;
    private int openTime;

    public Open (){

    }
    public  Open(int height1, int width1, int weight1){
        height=height1;
        width=width1;
        weight=weight1;
    }



    public void printFields(){
        System.out.println("height = " + height);
        System.out.println("width = " + width);
        System.out.println("weight = " + weight);
    }



}
