package org.colin.DesignPattern.VisitorPattern.GoodType;

/**
 * Created by Colin on 2017/4/5.
 */
public class Demo {
    public static void main(String[] args) {
        Service service = new Service();
        service.doService(new Member());
    }
}
