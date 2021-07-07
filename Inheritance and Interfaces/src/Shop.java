public class Shop {

    private String name;

    private Inventory inventory;

    private Integer shopPriceModifier;
    public Shop(String name, Inventory inventory, Integer shopPriceModifier){
        this.name = name;
        this.inventory = inventory;
        this.shopPriceModifier = shopPriceModifier;
    }

    public Integer getShopPriceModifier() {
        return shopPriceModifier;
    }
}
