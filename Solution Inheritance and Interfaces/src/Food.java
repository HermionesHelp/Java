
public class Food extends Item implements iConsumable, iSellable{
   private Integer healAmount;

    public Food (String name, String description, Integer quantity, Integer price, Integer healAmount) {
        super(name, description, quantity, price);
        this.healAmount = healAmount;
    }

    public Integer getHealAmount() {
        return healAmount;
    }

    public void setHealAmount(Integer healAmount) {
        this.healAmount = healAmount;
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
    public void affectCharacter(Character character) {
        character.heal(this.getHealAmount());
    }

    @Override
    public Integer determineSalePrice(Shop shop) {
        return this.getPrice()/shop.getShopPriceModifier();
    }
}
