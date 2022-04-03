package Builder;

public class FlatWhite implements CoffeeMaker {
    private Coffee coffee;

    public FlatWhite()
    {
        this.coffee = new Coffee();
    }

    public void water_temp()
    {
        coffee.setWatertemp("Hot steamed water");
    }

    public void element()
    {
        coffee.setElements("steamed milk");
    }

    public void main_element()
    {
        coffee.setMainelement("coffee");
    }

    public void speciality()
    {
        coffee.setSpeicalelement("Aussie-born drink");
    }

    public Coffee getCoffee()
    {
        return this.coffee;
    }
}
