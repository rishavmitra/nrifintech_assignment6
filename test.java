package assignment6;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<product> prods = new ArrayList<product>();
        product obj = new product("soap","cinthol",20,45);
        prods.add(0,obj);
        obj = new product("AfterShave","Park Avenue",5,170);
        prods.add(1,obj);
        obj = new product("face wash","Beardo",20,100);
        prods.add(2,obj);
        obj = new product("Goodnight","Goodnight",50,90);
        prods.add(3,obj);
        obj = new product("Hair oil","Parachute",70,30);
        prods.add(4,obj);
        // for (product ob : prods) {
        //     System.out.println(ob.name);
        //     System.out.println(ob.brand);
        //     System.out.println(ob.qty);
        //     System.out.println(ob.price);
        // }

        System.out.println("----Login----\n\n");
        System.out.print("Enter Name: ");
        String name = in.nextLine();
        System.out.print("Enter Email: ");
        String em = in.nextLine();
        System.out.print("Enter phone: ");
        BigInteger ph = in.nextBigInteger();

        cust custob = new cust(name,em,ph);
        // System.out.println(custob.phone);
        cart cartOb = new cart(custob);
        
        int flag = 0;
        while(flag ==0){
            System.out.println("-----Available Products-----");
            int i=1;
            for (product ob : prods) {
                System.out.println(i);
                System.out.print("Name: "+ob.name);
                System.out.print(" Brand: "+ob.brand);
                System.out.print(" Qty: "+ob.qty);
                System.out.println(" Price: "+ob.price);
                i++;
            }
            System.out.print("Enter the product number:");
            int cs = in.nextInt();

            switch (cs){
                case 1: cartOb.addtocart(prods.get(0));
                        prods.get(0).decre();
                        break;
                case 2: cartOb.addtocart(prods.get(1));
                        prods.get(1).decre();
                        break;
                case 3: cartOb.addtocart(prods.get(2));
                        prods.get(2).decre();
                        break;
                case 4: cartOb.addtocart(prods.get(3));
                        prods.get(3).decre();
                        break;
                case 5: cartOb.addtocart(prods.get(4));
                        prods.get(4).decre();
                        break;
                default: System.out.println("Invalid input");
                    break;
            }
            System.out.println("Do you want to continue?(yes/no)");
            String op = in.next();
            if(op.toLowerCase().equals("yes"))
            {
                flag = 0;
            }
            else
                flag =1;
            System.out.println("---------------------------Your Cart----------------------------");
            for (product ob : cartOb.allProds) {
                System.out.println(ob.name);
                System.out.println(ob.brand);
                System.out.print(ob.price+"\n\n");
            }
            System.out.print("Cart total: ");
            System.out.println(cartOb.cartot());
        }
    }
}
