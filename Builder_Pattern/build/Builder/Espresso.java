package Builder;

public class Espresso implements CoffeeMaker{
    private Coffee house;

    public Espresso()
    {
        this.house = new Coffee();
    }

    @Override
    public void water_temp()
    {
        house.setWatertemp("Less Hot Water");
    }

    @Override
    public void element()
    {
        house.setElements("Milk and foam");
    }

    @Override
    public void speciality() {
        house.setSpeicalelement("Robusta - espresso shot");
    }

    @Override
    public void main_element()
    {
        house.setMainelement("Coffee");
    }

    @Override
    public Coffee getCoffee()
    {
        return this.house;
    }
}
