package org.colin.DesignPattern.VisitorPattern.BadType;

/**
 * Created by Colin on 2017/4/5.
 */
public class Demo {

    public static void main(String[] args) {
        Customer c = new Customer();
        Customer m = new Member();
        Customer v = new Vip();
        Service.doService(v);
    }
}
