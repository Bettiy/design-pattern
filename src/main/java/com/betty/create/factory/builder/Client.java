package com.betty.create.factory.builder;

/**
 * @author betty
 * @date 2022/07/09
 */
public class Client {

    public static void main(String[] args) {
        Director director = new Director(new MobileBike());
        Bike bike = director.construct();
        System.out.println(bike);


        Builder builder = new OFOBike();
        System.out.println(builder.construct());
    }

}
