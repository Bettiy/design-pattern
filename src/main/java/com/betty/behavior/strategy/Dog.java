package com.betty.behavior.strategy;

import lombok.ToString;

/**
 * @author ys
 * @date 2022/07/03
 */
@ToString
public class Dog implements Comparable<Dog> {

    int food;

    public Dog(int food) {
        this.food = food;
    }

    @Override
    public int compareTo(Dog o) {
        return Integer.compare(this.food, o.food);
    }
}
