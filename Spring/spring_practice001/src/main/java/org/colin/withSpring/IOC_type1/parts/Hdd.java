package org.colin.withSpring.IOC_type1.parts;

/**
 * Created by Colin on 2017/5/15.
 */
public class Hdd implements Disk{
    @Override
    public void readFromDisk() {
        System.out.println("with spring type1 read from HDD");
    }
}
