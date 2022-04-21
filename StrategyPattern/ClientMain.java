package StrategyPattern;

public class ClientMain {
    public static void main(String[] args) {
        ShoppingCart sc = new ShoppingCart();

        sc.pay(new  BkashStrategy());
        sc.pay(new RocketStrategy());

    }

}
