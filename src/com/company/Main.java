package com.company;

public class Main {

    public static void main(String[] args) {
        GenericBox<String>box1=new GenericBox<String>("Strong Java Junior");
        String string=box1.getContent();
        System.out.println(box1);

        GenericBox<Integer>box2=new GenericBox<Integer>(3459345);
        int one=box2.getContent();
        System.out.println(box2);

        GenericBox<Double>box3=new GenericBox<Double>(34.59345);
        double two=box2.getContent();
        System.out.println(box3);



    }
}
