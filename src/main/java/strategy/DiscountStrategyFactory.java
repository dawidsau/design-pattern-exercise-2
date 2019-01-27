package strategy;

public class DiscountStrategyFactory{

    private static DiscountStrategy strategy;

    public static double getDiscountStrategy(ProductDiscountType type, double cost){
        if (type.equals(ProductDiscountType.CHRISTMAS)){
            strategy = new ChristmasDiscountStrategy();
            return strategy.getDiscountStrategy(cost);
        }else if (type.equals(ProductDiscountType.EASTER)){
            strategy = new EasternDiscountStrategy();
            return strategy.getDiscountStrategy(cost);
        }else if (type.equals(ProductDiscountType.NEW_YEAR)){
            strategy = new NewYearDiscountStrategy();
            return strategy.getDiscountStrategy(cost);
        }else{
            throw new IllegalDiscountType("Illegal discount type");
        }
    }

}
