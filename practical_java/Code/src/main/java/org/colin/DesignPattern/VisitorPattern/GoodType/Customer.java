package org.colin.DesignPattern.VisitorPattern.GoodType;

/**
 * Created by Colin on 2017/4/5.
 */
public class Customer implements Visitable {
    void doCustomer() {
        System.out.println("客戶服務");
    }
    void pay() {
        System.out.println("結帳");
    }
    @Override
    public void accept(Visitor visitor) {
        // nothing to do
    }
}
