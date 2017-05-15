package org.colin.withSpring.IOC_type1;

import org.colin.withSpring.IOC_type1.parts.Disk;

/**
 * Created by Colin on 2017/5/15.
 */
public class type1_Pc implements IDependencyInjection {

    private Disk disk;

    @Override
    public void createDependency(Disk disk) {
        this.disk = disk;
    }

    public void read(){
        disk.readFromDisk();
    }
}
