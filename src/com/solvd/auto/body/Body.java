package com.solvd.auto.body;

public class Body {
   private int height;
     private int width;
    private   int weight;
    public String color;

   public Body (){
       height=0;
       weight=0;
       width=0;
       color="white";
   }
   public  Body(int height1,  int width1, int weight1){
       height=height1;
       width=width1;
       weight=weight1;
   }
   public void setColor(String color1){
       color=color1;
   }
   public String getColor(){
       return color;
   }



   public void printFields(){
       System.out.println("height = "+height);
       System.out.println("weight = "+weight);
       System.out.println("width = "+width);
   }


}
