package org.colin.withSpring.IOC_type2.parts;

/**
 * Created by colin.lee on 2017/5/10.
 */
public class Hdd implements Disk {
    @Override
    public void readFromDisk() {
        System.out.println("type2 withSpring Read from Hdd");
    }
}
