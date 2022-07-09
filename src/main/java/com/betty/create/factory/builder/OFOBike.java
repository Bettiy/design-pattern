package com.betty.create.factory.builder;

/**
 * @author betty
 * @date 2022/07/09
 */
public class OFOBike extends Builder {

    @Override
    public void buildFrame() {
        bike.setFrame("ofo车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("ofo座椅");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
