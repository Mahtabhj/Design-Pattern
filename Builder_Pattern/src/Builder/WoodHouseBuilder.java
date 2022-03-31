package Builder;

public class WoodHouseBuilder implements HouseBuilder{
    private House house;

    public WoodHouseBuilder()
    {
        this.house = new House();
    }

    @Override
    public void buildBasement()
    {
        house.setBasement("Wooden Poles");
    }

    @Override
    public void buildStructure()
    {
        house.setStructure("Wood and Ice");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Wood, caribou and seal skins");
    }

    @Override
    public void buildInterior()
    {
        house.setInterior("Fire Wood");
    }

    @Override
    public House getHouse()
    {
        return this.house;
    }
}
