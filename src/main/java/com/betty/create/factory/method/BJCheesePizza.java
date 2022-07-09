package com.betty.create.factory.method;

/**
 * @author ys
 * @date 2022/06/13
 */
public class BJCheesePizza extends Pizza {
    @Override
    void prepare() {
        System.out.println("北京的奶酪pizza 准备原材料");
    }
}
