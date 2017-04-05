package org.colin.DesignPattern.VisitorPattern.GoodType;

/**
 * Created by Colin on 2017/4/5.
 */
public class Member extends Customer{

    void doMember() {
        System.out.println("會員服務");
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); // 看似多型，其實是 overload
    }
}
