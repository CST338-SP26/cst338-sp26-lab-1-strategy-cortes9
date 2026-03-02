package edu.csumb;

public class Driver {

    public static void main(String[] args) {

        edu.csumb.Monster imp = new edu.csumb.Imp(5, 10);
        edu.csumb.Monster kobold = new edu.csumb.Kobold(8, 12);

        System.out.println(imp);
        System.out.println(kobold);
    }
}