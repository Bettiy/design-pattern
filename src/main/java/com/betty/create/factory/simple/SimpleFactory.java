package com.betty.create.factory.simple;

/**
 * @author ys
 * @date 2022/06/12
 */
public class SimpleFactory {

    public Pizza createPizza(String type) {
        if (type.equals("greek")) {

        }
        return () -> System.out.println("fasjf");
    }

}
