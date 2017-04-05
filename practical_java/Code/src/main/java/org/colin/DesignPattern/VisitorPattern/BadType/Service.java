package org.colin.DesignPattern.VisitorPattern.BadType;



/**
 * Created by Colin on 2017/4/5.
 */
public class Service {

    /**
     * 糟糕的寫法，沒有彈性，若以後增加新的Customer類型難以維護
     * @param customer
     */
    static void doService(Customer customer){
        customer.doCustomer();
        if(customer instanceof Member){
            ((Member)customer).doMember();
        }
        if(customer instanceof Vip){
            ((Vip)customer).doVip();
        }
        customer.pay();
    }
}
