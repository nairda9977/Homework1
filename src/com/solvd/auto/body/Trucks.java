package com.solvd.auto.body;

public class Trucks extends Body {
    private int height;
    private int width;
    private int weight;


    public Trucks (){

    }
    public Trucks(int height1, int width1, int weight1){
        height=height1;
        width=width1;
        weight=weight1;
    }

public void printFields(){
    System.out.println("Height = " + height+" cm");
    System.out.println("Width = " + width+" cm");
    System.out.println("Weight = " + weight+ " kg ");

}



}
