package StrategyPattern;

public class RocketStrategy implements IPaymentMethodStrategy {
    @Override
    public void execute() {
        System.out.println("This is Rocket payment");

    }
}
