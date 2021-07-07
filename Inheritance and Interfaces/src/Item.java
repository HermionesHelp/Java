public abstract class Item {
    private String name;
    private String description;
    private Integer quantity;
    private Integer price;

    public Item (String name, String description, Integer quantity, Integer price){
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public String getItem (){
        return this.getName() + "\n Description: " + this.getDescription() + "\n I have " + this.getQuantity() + ", they cost " + this.getPrice() + " gold.\n";
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getPrice() {
        return price;
    }

    private void setPrice(Integer price) {
        this.price = price;
    }

    public String toString() {
        return String.format("%s - %s" , this.getName(), this.getDescription());
    }
}