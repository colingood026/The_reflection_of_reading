package org.colin.withoutSpring.withInterface;

import org.colin.withoutSpring.withInterface.parts.Disk;
import org.colin.withoutSpring.withInterface.parts.Hdd;
import org.colin.withoutSpring.withInterface.parts.Ssd;

/**
 * Created by colin.lee on 2017/5/10.
 */
public class Demo {

    public static void main(String[] args) {

        Disk hdd = new Hdd();
        Pc pcHdd = new Pc();
        pcHdd.setDisk(hdd);
        pcHdd.read();
        //
        Disk ssd = new Ssd();
        Pc pcSsd = new Pc();
        pcSsd.setDisk(ssd);
        pcSsd.read();

    }
}
