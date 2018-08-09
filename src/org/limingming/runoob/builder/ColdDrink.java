package org.limingming.runoob.builder;

/**
 * Created by limm on 2018/8/9.
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}