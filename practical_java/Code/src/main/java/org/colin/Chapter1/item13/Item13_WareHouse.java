package org.colin.Chapter1.item13;

/**
 * Created by Colin on 2017/3/27.
 */
public class Item13_WareHouse {


    public static void main(String[] args) {

        // 1 normal
        //MyGolfBall mgb1 = new MyGolfBall("BranX", "Professional", 100, MyGolfBall.TwoPiece);
        //MyGolfBall mgb2 = new MyGolfBall("BranX", "Professional", 100, MyGolfBall.TwoPiece);
        //
        //if(mgb1.equals(mgb2)){
        //    System.out.println("mgb1 equals mgb2");
        //}else{
        //    System.out.println("mgb1 not equals mgb2");
        //}
        // 2 父類別裡面的屬性值不同
        MyGolfBall mgb3 = new MyGolfBall("BranX", "Professional", 100, MyGolfBall.TwoPiece);
        MyGolfBall mgb4 = new MyGolfBall("BranX", "Professional", 90, MyGolfBall.TwoPiece);

        if(mgb3.equals(mgb4)){
            System.out.println("mgb3 equals mgb4");
        }else{
            System.out.println("mgb3 not equals mgb4");
        }
    }
}
