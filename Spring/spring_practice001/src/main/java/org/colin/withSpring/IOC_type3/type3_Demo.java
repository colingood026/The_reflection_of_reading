package org.colin.withSpring.IOC_type3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Colin on 2017/5/15.
 */
public class type3_Demo {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-bean.xml");
        Type3_Pc hddType3Pc = (Type3_Pc)context.getBean("hddType3Pc");
        hddType3Pc.read();
        Type3_Pc ssdType3Pc = (Type3_Pc)context.getBean("ssdType3Pc");
        ssdType3Pc.read();
    }
}
