package assignment6;

import java.util.ArrayList;

public class cart {
    int id;
    float cartTot;
    ArrayList<product> allProds = new ArrayList<>();

    cart(cust obj){
        this.id = obj.custId;
    }
    void addtocart(product obj){
        this.allProds.add(obj);
    }
    float cartot(){
        float price = 0f;
        for(product pri:allProds)
        {
            price = price + pri.price;
        }
        return price;
    }
}
