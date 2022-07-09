package com.betty.behavior.strategy;

import lombok.AllArgsConstructor;
import lombok.ToString;

/**
 * @author ys
 * @date 2022/07/03
 */
@AllArgsConstructor
@ToString
public class Dog implements Comparable<Dog> {

    int food;

    @Override
    public int compareTo(Dog o) {
        return Integer.compare(this.food, o.food);
    }
}
