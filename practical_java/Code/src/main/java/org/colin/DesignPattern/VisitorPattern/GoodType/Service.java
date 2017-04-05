package org.colin.DesignPattern.VisitorPattern.GoodType;

/**
 * Created by Colin on 2017/4/5.
 */
public class Service {

    private Visitor visitor = new VisitorImpl();
    /**
     * 由Visitor登門入戶，使用物件中的this參考名稱之型態資訊，由物件自行選擇要呼叫的overload方法。
     * @param customer
     */
    void doService(Customer customer) {

        customer.doCustomer();
        ((Visitable) customer).accept(visitor);
        customer.pay();
    }
}
