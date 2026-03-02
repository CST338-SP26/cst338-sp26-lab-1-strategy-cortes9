package edu.csumb;

public class Imp extends edu.csumb.Monster {

    public Imp(Integer hp, Integer maxHP) {
        super(hp, maxHP);
    }

    @Override
    public String toString() {
        return "Imp " + super.toString();
    }
}