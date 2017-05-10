package org.colin.withoutSpring.withoutInterface;


import org.colin.withoutSpring.withoutInterface.parts.Ssd;

/**
 * Created by colin.lee on 2017/5/10.
 */
public class Pc_Ssd {

    private Ssd ssd = new Ssd();

    public void read(){
        ssd.readFromSsd();
    }
}
