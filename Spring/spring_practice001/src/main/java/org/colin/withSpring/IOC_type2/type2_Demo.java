package org.colin.withSpring.IOC_type2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Colin on 2017/5/15.
 */
public class type2_Demo {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-bean.xml");
        Type2_Pc hddType2Pc = (Type2_Pc)context.getBean("hddType2Pc");
        hddType2Pc.read();
        Type2_Pc ssdType2Pc = (Type2_Pc)context.getBean("ssdType2Pc");
        ssdType2Pc.read();
    }
}
