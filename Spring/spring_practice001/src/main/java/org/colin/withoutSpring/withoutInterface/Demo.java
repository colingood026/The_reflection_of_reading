package org.colin.withoutSpring.withoutInterface;

/**
 * Created by colin.lee on 2017/5/10.
 */
public class Demo {
    public static void main(String[] args) {
        Pc_Hdd pcHdd = new Pc_Hdd();
        pcHdd.read();
        Pc_Ssd pcSsd = new Pc_Ssd();
        pcSsd.read();
    }
}
