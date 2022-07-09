package com.betty.behavior.strategy;

/**
 * @author ys
 * @date 2022/07/03
 */
public class Cat implements Comparable<Cat> {

    int weight;
    int height;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public int compareTo(Cat o) {
        return Integer.compare(this.weight, o.weight);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
