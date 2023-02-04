package assignment6;

import java.math.BigInteger;
import java.util.Random;

public class cust {
    String name;
    String email;
    BigInteger phone;
    int custId;

    cust(String nm,String em,BigInteger ph){
        this.name = nm;
        this.email = em;
        this.phone = ph;
        Random rand = new Random();
        this.custId = rand.nextInt(0, 1000);
    }
}
