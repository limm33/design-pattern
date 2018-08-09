package org.limingming.runoob.builder;

/**
 * Created by limm on 2018/8/9.
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}