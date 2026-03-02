package edu.csumb;

public class Kobold extends edu.csumb.Monster {

    public Kobold(Integer hp, Integer maxHP) {
        super(hp, maxHP);
    }

    @Override
    public String toString() {
        return "Kobold " + super.toString();
    }
}