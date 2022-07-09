package com.betty.behavior.strategy;

import java.util.Arrays;

/**
 * @author ys
 * @date 2022/07/03
 */
public class Main {

    public static void main(String[] args) {
        Dog[] dogs = {new Dog(1), new Dog(5), new Dog(3)};
        Sorter<Dog> sorter = new Sorter<>();
        sorter.sort(dogs, new DogComparator());
        System.out.println(Arrays.toString(dogs));
    }

}
