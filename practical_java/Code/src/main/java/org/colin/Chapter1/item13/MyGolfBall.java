package org.colin.Chapter1.item13;

import org.colin.Chapter1.item10.Golfball;

/**
 * Created by Colin on 2017/3/27.
 */
public class MyGolfBall extends Golfball{
    public final static byte TwoPiece = 0;
    public final static byte ThreePiece = 1;
    private byte ballConstruction;


    public MyGolfBall(String brd, String mk, int comp, byte construction){
        // 將 byte型別的construction傳入Golfball建構子中的int型別不會出事??
        super(brd,mk,comp);
        this.ballConstruction = construction;
    }


    public byte getBallConstruction() {
        return ballConstruction;
    }

    public void setBallConstruction(byte ballConstruction) {
        this.ballConstruction = ballConstruction;
    }


    @Override
    public boolean equals(Object obj) {

        if(this == obj){
            return true;
        }



        if(obj != null && getClass() == obj.getClass()
           && super.equals(obj) // 子類別時做equals()時要先呼叫父類別的euqals()
                ){

            MyGolfBall mgb = (MyGolfBall)obj;

            if(this.ballConstruction == mgb.getBallConstruction()){
                return true;
            }

        }

        return false;
    }
}
