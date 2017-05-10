package org.colin.withoutSpring.withInterface.parts;

/**
 * Created by colin.lee on 2017/5/10.
 */
public class Ssd implements Disk {
    @Override
    public void readFromDisk() {
        System.out.println("Read from Ssd");
    }
}
