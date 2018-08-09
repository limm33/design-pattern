package org.limingming.runoob.builder;

/**
 * Created by limm on 2018/8/9.
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}