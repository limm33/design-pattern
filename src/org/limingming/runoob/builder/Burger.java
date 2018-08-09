package org.limingming.runoob.builder;

/**
 * Created by limm on 2018/8/9.
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}