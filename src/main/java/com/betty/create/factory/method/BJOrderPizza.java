package com.betty.create.factory.method;

/**
 * @author ys
 * @date 2022/06/13
 */
public class BJOrderPizza extends OrderPizza {
    @Override
    public Pizza createPizza() {
        return new BJCheesePizza();
    }
}
