package headfirst.decorator.starbuzz;

/**
 * 浓缩咖啡的类
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}

