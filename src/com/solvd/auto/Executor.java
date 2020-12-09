package com.solvd.auto;

import com.solvd.auto.body.*;

public class Executor {
    public static void main(String[] args) {
       System.out.println("==SEDAN==");
        Sedan sedan1 = new Sedan();
        sedan1.printFields();

        System.out.println("==Opel=CONSTRUCTOR=");
        Sedan opel = new Sedan(115, 140, 1400);
        opel.printFields();

        System.out.println("===Mazda-6=from-sedan");
        Sedan mazda_6 = new Sedan();
        mazda_6.setHeight(120);
        mazda_6.setWidth(160);
        mazda_6.setComfort("Business");
        mazda_6.printFields();


        System.out.println("=Open=PORSHE-911==");
        Cabrio porshe911 = new Cabrio();
        porshe911.setHeight(112);
        porshe911.setOpenTime(9);
        porshe911.setWidth(140);
        porshe911.setWeight(1320);
        porshe911.setColor("blue");
        porshe911.printFields();

     System.out.println("==AUDI=Avant");
     Universal audiAvant = new Universal(132, 1220, 1400);
     audiAvant.setSuv("Meddle");
     audiAvant.printFields();

     System.out.println("=FORD=RANGER");
     PickUp fordRanger= new PickUp(190, 170, 1900);
     fordRanger.setTrunk(1500);
     fordRanger.printFields();
     System.out.println("=MERCEDES=VITO=");
     Van mercedesVito = new Van(240, 170, 2700);
     mercedesVito.setTrunk(12500);
     mercedesVito.printFields();






    }
}
