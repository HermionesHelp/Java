import java.util.ArrayList;

public class Potion implements iConsumable, iSellable{
    // Will need to extend the Item class
    // Will need to have a property that will hold our manaAmount our health will be increased by consuming the Potion
    // Will need getter and setter for that manaAmount property
    // Will need a constructor that passes the expected parameters to the Item class's constructor.

    @Override
    public void removeItem(Character character) {
        character.getInventory().removeItem(this);
    }

    @Override
    public void updateGold(Character character) {
        Integer newTotal = character.getGold()+ this.getPrice();
        character.setGold(newTotal);
    }

    @Override
    public void affectCharacter(Character character) {
        character.heal(this.getManaAmount());
    }

    @Override
    public Integer determineSalePrice(Shop shop) {
        return this.getPrice()/shop.getShopPriceModifier();
    }
}


