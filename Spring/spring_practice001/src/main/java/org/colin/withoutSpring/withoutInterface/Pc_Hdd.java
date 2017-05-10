package org.colin.withoutSpring.withoutInterface;

import org.colin.withoutSpring.withoutInterface.parts.Hdd;

/**
 *
 * 在這個範例中，Pc的讀取依賴於實際的HDD，
 * 如果今天想要改從SSD讀取，則必須改寫Pc或是繼承Pc進行擴稱，
 * 而無法直接使用Pc。
 * Pc這個類無法重用。
 * Created by colin.lee on 2017/5/10.
 */
public class Pc_Hdd {
    private Hdd hdd = new Hdd();

    public void read(){
        hdd.readFromHdd();
    }
}
