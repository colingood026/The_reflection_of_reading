package org.colin.DesignPattern.VisitorPattern.GoodType;

/**
 * Created by Colin on 2017/4/5.
 */
public class VIP extends Customer{

    void doVIP() {
        System.out.println("VIP 服務");
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); // 看似多型，其實是 overload
    }
}
