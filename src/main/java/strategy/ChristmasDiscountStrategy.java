package strategy;

public class ChristmasDiscountStrategy  implements DiscountStrategy{

    @Override
    public double getDiscountStrategy(double cost) {
        return 0.15 * cost;
    }
}
