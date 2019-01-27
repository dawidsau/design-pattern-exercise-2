package strategy;

public class NewYearDiscountStrategy implements DiscountStrategy {

    @Override
    public double getDiscountStrategy(double cost) {
        return 0.2 * cost;
    }
}
