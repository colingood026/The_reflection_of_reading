package org.colin.withSpring.IOC_type3;


import org.colin.withSpring.IOC_type3.parts.Disk;

/**
 * 在這個範例中，Pc的讀取依賴於抽象的Disk，
 * 只要是實現Disk的儲存裝置，
 * 不用改寫或繼承Pc類，就可以從HDD或SSD讀取。
 * Pc這個類就可以重用了。
 * Created by colin.lee on 2017/5/10.
 */
public class Type3_Pc {

    private Disk disk;

    public Type3_Pc(Disk disk) {
        this.disk = disk;
    }

    public void read(){
        disk.readFromDisk();
    }
}
