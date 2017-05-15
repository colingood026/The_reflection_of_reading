package org.colin.withSpring.IOC_type3.parts;

/**
 * Created by colin.lee on 2017/5/10.
 */
public class Hdd implements Disk {
    @Override
    public void readFromDisk() {
        System.out.println("withSpring type3 Read from Hdd");
    }
}
