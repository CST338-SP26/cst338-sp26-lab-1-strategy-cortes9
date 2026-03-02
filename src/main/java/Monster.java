package edu.csumb;

import java.util.HashMap;

public abstract class Monster {

    private Integer hp;
    private Integer xp;
    private Integer maxHP;
    private HashMap<String, Integer> items;

    public Monster(Integer hp, Integer maxHP) {
        this.hp = hp;
        this.maxHP = maxHP;
        this.xp = 10; // default xp
        this.items = new HashMap<>();
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getXp() {
        return xp;
    }

    public Integer getMaxHP() {
        return maxHP;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Monster)) return false;

        Monster other = (Monster) obj;

        return this.hp.equals(other.hp) &&
                this.xp.equals(other.xp) &&
                this.maxHP.equals(other.maxHP) &&
                this.items.equals(other.items);
    }

    @Override
    public int hashCode() {
        return hp + xp + maxHP;
    }

    @Override
    public String toString() {
        return "HP: " + hp + "/" + maxHP + " XP: " + xp;
    }
}