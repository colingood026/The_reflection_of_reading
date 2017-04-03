package org.colin.Chapter1.item10;

/**
 * Created by Colin on 2017/3/27.
 */
public class Golfball {
    private String brand;
    private String make;
    private int compression;



    public Golfball(String brand, String make, int compression){
        this.brand = brand;
        this.make = make;
        this.compression = compression;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getCompression() {
        return compression;
    }

    public void setCompression(int compression) {
        this.compression = compression;
    }


    @Override
    public boolean equals(Object obj) {

        if (this == obj){
            return true;
        }


        if(obj != null && getClass() == obj.getClass()){
            Golfball gb = (Golfball)obj;
            if (this.brand.equals(gb.getBrand()) &&
                this.make.equals(gb.getMake()) &&
                this.compression == gb.getCompression()) {
                return true;
            }
        }



        return false;
    }
}
