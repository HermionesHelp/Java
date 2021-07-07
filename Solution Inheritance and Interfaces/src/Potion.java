public class Potion extends Item implements iConsumable, iSellable{
    private Integer manaAmount;

    public Integer getManaAmount() {
        return manaAmount;
    }

    public void setManaAmount(Integer manaAmount) {
        this.manaAmount = manaAmount;
    }

    public Potion(String name, String description, Integer quantity, Integer price, Integer manaAmount) {
        super(name, description, quantity, price);
        this.manaAmount = manaAmount;
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
        character.heal(this.getManaAmount());
    }

    @Override
    public Integer determineSalePrice(Shop shop) {
        return this.getPrice()/shop.getShopPriceModifier();
    }
}
