import java.util.ArrayList;

public class Program {
    public static void main(String[] args)
    {
        Tool flint = new Tool("Flint", "Used to start fire", 10, 10);
        Tool rope = new Tool("Rope", "Ties things together, lets you climb things", 10, 10);
        Potion potion = new Potion("Healing Potion", "Restore healths - Tastes terrible", 10, 20, 10);
        Weapon rohirrim = new Weapon("Rohirrim", "Twin blades of speed and savagery", 1, 1000);
        Food apple = new Food ("Red Apple", "A tasty red apple", 10, 2, 10);

        ArrayList<Tool> tools = new ArrayList<>();
        ArrayList<Food> foods = new ArrayList<>();
        ArrayList<Potion> potions = new ArrayList<>();
        ArrayList<Weapon> weapons = new ArrayList<>();

        tools.add(flint);
        tools.add(rope);
        potions.add(potion);
        weapons.add(rohirrim);
        foods.add(apple);

        Inventory inventory = new Inventory(tools, foods, weapons, potions);

        Character elf1 = new Character("Legoas", inventory);
        System.out.println(elf1.printInventory());

    }
}
