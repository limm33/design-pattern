package org.limingming.runoob.builder;

/**
 * Created by limm on 2018/8/9.
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}