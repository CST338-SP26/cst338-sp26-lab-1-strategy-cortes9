package edu.csumb;

import java.util.HashMap;

public abstract class Monster {

    private Integer hp;
    private Integer xp;
    private Integer maxHP;
    private HashMap<String, Integer> items;

    public Monster(Integer hp, Integer maxHP) {
    }

    public Integer getHp() {
        return null;
    }

    public void setHp(Integer hp) {
    }

    public Integer getXp() {
        return null;
    }

    public Integer getMaxHP() {
        return null;
    }

    public HashMap<String, Integer> getItems() {
        return null;
    }

    public void setItems(HashMap<String, Integer> items) {
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }
}