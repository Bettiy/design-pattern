package com.betty.create.factory.builder;

/**
 * @author betty
 * @date 2022/07/09
 */
public abstract class Builder {

    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();

    public final Bike construct() {
        buildFrame();
        buildSeat();
        return createBike();
    }

}
