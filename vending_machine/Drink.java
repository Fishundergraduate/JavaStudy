package vending_machine;

public class Drink {
    private int lot;
    private String name;
    private int price;

    public Drink(){
        lot =0;
        name = "default";
        price = 0;
    }
    public Drink(String name, int amount, int price){
        this.lot = amount;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getRemainLot() {
        return lot;
    }

    public int getPrice() {
        return price;
    }
    
}
