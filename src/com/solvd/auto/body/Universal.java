package com.solvd.auto.body;

public class Universal extends Close {
    private int height;
    private int width;
    private int weight;
    protected String suv;

    public Universal(){

    }
    public Universal(int height1, int width1, int weight1){
    height=height1;
    width=width1;
    weight=weight1;
    }
    public void setSuv(String suv1){
        suv = suv1;
    }
        public String getSuv(){
        return suv;
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
        System.out.println("Проходимость = " + suv );
    }


}
