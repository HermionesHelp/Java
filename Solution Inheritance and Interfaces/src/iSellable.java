public interface iSellable {
    void removeItem(Character character);
    void updateGold(Character character);
    Integer determineSalePrice(Shop shop);
}