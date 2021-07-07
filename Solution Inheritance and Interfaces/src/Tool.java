public class Tool extends Item implements iDestructable, iSellable, iReparable{
    private Integer totalDamage;
    private boolean usable;

    public Tool(String name, String description, Integer quantity, Integer price) {
        super(name, description, quantity, price);
        this.totalDamage = 100;
        this.usable = true;
    }

    public Integer getTotalDamage() {
        return totalDamage;
    }

    public void setTotalDamage(Integer totalDamage) {
        this.totalDamage = totalDamage;
    }

    public boolean isUsable() {
        return usable;
    }

    public void setUsable(boolean usable) {
        this.usable = usable;
    }

    @Override
    public void takeDamage() {
        Integer newDamage = this.totalDamage - 1;
        this.setTotalDamage(newDamage);
    }

    @Override
    public void destroyItem() {
        if (this.totalDamage == 0){
            this.usable = false;
        }
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
    public void repairItem(Integer repairAmount) {
        if (this.usable != false && this.totalDamage >= 1){
            this.totalDamage += repairAmount;
        }
    }

    @Override
    public Integer determineSalePrice(Shop shop) {
        return this.getPrice()/shop.getShopPriceModifier();
    }
}
