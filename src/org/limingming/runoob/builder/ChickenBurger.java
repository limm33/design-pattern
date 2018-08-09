package org.limingming.runoob.builder;

/**
 * Created by limm on 2018/8/9.
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}