package strategy;

public class EasternDiscountStrategy implements DiscountStrategy{
    @Override
    public double getDiscountStrategy(double cost) {
        return 0.10 * cost;
    }
}
