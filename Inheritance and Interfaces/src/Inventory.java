import java.util.ArrayList;

public class Inventory {
    private ArrayList<Tool> tools;
    private ArrayList<Food> food;
    private ArrayList<Weapon> weapons;
    private ArrayList<Potion> potions;

       public Inventory(ArrayList<Tool> tools, ArrayList<Food> food, ArrayList<Weapon> weapons, ArrayList<Potion> potions) {
        this.tools = tools;
        this.food = food;
        this.weapons = weapons;
        this.potions = potions;
    }

    public void removeItem (Object item){
       if (this.tools.contains(item)){
           tools.remove(item);
       } else if (this.food.contains(item)){
           food.remove(item);
       }else if (this.weapons.contains(item)){
           this.weapons.remove(item);
       }else if (this.potions.contains(item)){
           this.potions.remove(item);
       }
    }

    @Override
    public String toString() {
        return "Inventory" +
                "\nTools=" + tools +
                "\nFood=" + food +
                "\nWeapons=" + weapons +
                "\nPotions=" + potions;
    }
}
