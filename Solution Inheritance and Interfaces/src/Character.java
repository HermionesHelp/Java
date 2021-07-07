import com.sun.jdi.IntegerValue;

import java.util.ArrayList;

public class Character {
    private String name;
    private Integer health;
    private Integer mana;
    private Inventory inventory;
    private Integer gold;

    public Character(String name, Inventory inventory) {
        this.name = name;
        this.health = 100;
        this.mana = 100;
        this.inventory = inventory;
    }
    public Character(String name) {
        this.name = name;
        this.health = 50;
        this.mana = 50;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public void heal(Integer healAmount){
        if (this.health + healAmount >= 100){
            this.health = 100;
        } else {
            this.health = this.health + healAmount;
        }
    }

    public Integer getMana() {
        return mana;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }

    public void recover(Integer manaAmount){
        if (this.mana + manaAmount >= 100){
            this.mana = 100;
        } else {
            this.health = this.mana + manaAmount;
        }
    }

    public String printInventory(){
        return this.inventory.toString();
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }
}
