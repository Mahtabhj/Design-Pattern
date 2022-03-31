package Builder;

public class CivilEngineer {
    private HouseBuilder houseBuilder;

    public CivilEngineer(){}

    public CivilEngineer(HouseBuilder houseBuilder)
    {
        this.houseBuilder = houseBuilder;
    }

    public House getHouse()
    {
        return this.houseBuilder.getHouse();
    }

    public void constructIglooHouse(){
        houseBuilder = new IceHouseBuilder() ;
        constructHouse();
    }

    public void constructTipiHouse(){
        houseBuilder = new WoodHouseBuilder() ;
        constructHouse();
    }

    public void constructHouse()
    {
        this.houseBuilder.buildBasement();
        this.houseBuilder.buildStructure();
        this.houseBuilder.buildRoof();
        this.houseBuilder.buildInterior();
    }
}
