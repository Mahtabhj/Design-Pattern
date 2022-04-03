package Builder;

public class MainClass {
    public static void main(String[] args)
    {
        CoffeeMaker flatwhite = new FlatWhite();
        Chef chef = new Chef(flatwhite);

        chef.constructCoffee();

        Coffee coffee = chef.getCoffee();

        System.out.println("Coffee is ready : "+ coffee.toString());

        chef = new Chef();
        chef.constructEspresso();
        coffee = chef.getCoffee() ;
        System.out.println("Coffe is ready: "+ coffee.toString());
    }
}
