package Builder;

public class Chef {
    private CoffeeMaker houseBuilder;

    public Chef(){}

    public Chef(CoffeeMaker houseBuilder)
    {
        this.houseBuilder = houseBuilder;
    }

    public Coffee getCoffee()
    {
        return this.houseBuilder.getCoffee();
    }

    public void constructIglooHouse(){
        houseBuilder = new FlatWhite() ;
        constructCoffee();
    }

    public void constructEspresso(){
        houseBuilder = new Espresso() ;
        constructCoffee();
    }

    public void constructCoffee()
    {
        this.houseBuilder.water_temp();
        this.houseBuilder.element();
        this.houseBuilder.speciality();
        this.houseBuilder.main_element();
    }
}
