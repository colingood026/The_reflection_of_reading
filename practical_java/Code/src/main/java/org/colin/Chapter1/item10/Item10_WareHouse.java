package org.colin.Chapter1.item10;

/**
 * Created by Colin on 2017/3/27.
 */
public class Item10_WareHouse {
    public static void main(String[] args) {
        Golfball gb1 = new Golfball("BranX", "Professional", 100);
        Golfball gb2 = new Golfball("BranX", "Professional", 90);

        if(gb1.equals(gb2)){
            System.out.println("gb1 equals gb2");
        }else{
            System.out.println("gb1 not equals gb2");
        }
    }
}
