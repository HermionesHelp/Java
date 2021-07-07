public class Weapon implements iDestructable, iSellable, iReparable{
    // Will need to extend the Item class
    // Will need to have a property that will hold the totalDamage this item can take - this will default to 100
    // Will need a boolean to define if this item is usable or not - this will default to true
    // Will need getter and setter for that totalDamage and usable property
    // Will need a constructor that passes the expected parameters to the Item class's constructor.

    @Override
    public void takeDamage() {
        Integer newDamage = this.totalDamage - 5;
        this.setTotalDamage(newDamage);
    }

    @Override
    public void destroyItem(){
        if (this.totalDamage == 0){
            this.usable = false;
        }
    }

    @Override
    public void removeItem(Character character) {
        character.getInventory().removeItem(this);
    }

    @Override
    public Integer determineSalePrice(Shop shop) {
        return this.getPrice()/shop.getShopPriceModifier();
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
}
