package StrategyPattern;

public class BkashStrategy implements IPaymentMethodStrategy {
    @Override
    public void execute() {
        System.out.println("This is Bkash payment");
    }
}
