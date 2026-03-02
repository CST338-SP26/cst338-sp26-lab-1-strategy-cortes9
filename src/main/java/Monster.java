package edu.csumb;

public abstract class Monster {

    private String name;
    private int hp;
    private int maxHP;
    private int xp = 10; // default value

    public Monster(String name, int hp, int maxHP) {
    }

    public String getName() {
        return null;
    }

    public void setName(String name) {
    }

    public int getHp() {
        return 0;
    }

    public void setHp(int hp) {
    }

    public int getMaxHP() {
        return 0;
    }

    public void setMaxHP(int maxHP) {
    }

    public int getXp() {
        return 0;
    }

    public void setXp(int xp) {
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}