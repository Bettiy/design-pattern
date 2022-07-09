package com.betty.create.factory.builder;

/**
 * @author betty
 * @date 2022/07/09
 */
public class MobileBike extends Builder {

    @Override
    public void buildFrame() {
        bike.setFrame("mobile车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("mobile座椅");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
