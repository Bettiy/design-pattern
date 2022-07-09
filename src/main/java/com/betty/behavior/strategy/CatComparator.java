package com.betty.behavior.strategy;

/**
 * @author ys
 * @date 2022/07/03
 */
public class CatComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        return Integer.compare(o1.weight, o2.weight);
    }

}
