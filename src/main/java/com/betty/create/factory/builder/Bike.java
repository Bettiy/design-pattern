package com.betty.create.factory.builder;

/**
 * @author betty
 * @date 2022/07/09
 */
public class Bike {

    private String frame;

    private String seat;

    public Bike() {
    }

    public Bike(String frame, String seat) {
        this.frame = frame;
        this.seat = seat;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "frame='" + frame + '\'' +
                ", seat='" + seat + '\'' +
                '}';
    }
}
