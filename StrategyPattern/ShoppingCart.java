package StrategyPattern;

public class ShoppingCart {

    public  void pay(IPaymentMethodStrategy p)

    {
        p.execute();
    }

}
