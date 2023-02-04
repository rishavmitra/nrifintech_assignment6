package assignment6;

public class product {
    
    // name,brand,qty,price
    String name;
    String brand;
    int qty;
    float price;
    product(String name, String brand, int qty, float price){
        this.name = name;
        this.brand = brand;
        this.qty = qty;
        this.price = price;
    }
    void decre(){
        this.qty = this.qty-1;
    }

}
