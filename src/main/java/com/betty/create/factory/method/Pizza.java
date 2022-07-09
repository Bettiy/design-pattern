package com.betty.create.factory.method;

import lombok.Data;

/**
 * @author ys
 * @date 2022/06/13
 */
@Data
public abstract class Pizza {

    private String name;

    abstract void prepare();

}
