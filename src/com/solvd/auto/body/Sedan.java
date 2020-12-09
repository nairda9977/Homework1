package com.solvd.auto.body;

public class Sedan extends Close{
    private int height;
    private int width;
    private   int weight;
    private String comfort;


    public Sedan(){
        height=0;
        width=0;
        weight=0;
    }
    public Sedan(int height1, int width1, int weight1){
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
public void setComfort(String comfort1){
        comfort=comfort1;
}
public String getComfort(){
        return comfort;
}

    public void printFields(){
        System.out.println("Height = " + height+" cm");
        System.out.println("Width = " + width+" cm");
        System.out.println("Weight = " + weight+ " kg ");
        System.out.println("Comfort = " + comfort + " class");
    }



}
