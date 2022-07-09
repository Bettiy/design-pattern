package com.betty.create.factory.builder;

/**
 * @author betty
 * @date 2022/07/09
 */
public class Director {

    // 生命builder类型的变量
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }

}
