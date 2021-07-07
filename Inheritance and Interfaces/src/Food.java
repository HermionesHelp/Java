public class Food implements iConsumable, iSellable{
    // Will need to extend the Item class
    // Will need to have a property that will hold our healAmount our health will be increased by consuming the Food
    // Will need getter and setter for that healAmount property
    // Will need a constructor that passes the expected parameters to the Item class's constructor.

    @Override
    public void affectCharacter(Character character) {
        character.heal(this.getHealAmount());
    }

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
    public Integer determineSalePrice(Shop shop) {
        return this.getPrice()/shop.getShopPriceModifier();
    }
}
