package Builder;

public class MainClass {
    public static void main(String[] args)
    {
        HouseBuilder iglooBuilder = new IceHouseBuilder();
        CivilEngineer engineer = new CivilEngineer(iglooBuilder);

        engineer.constructHouse();

        House house = engineer.getHouse();

        System.out.println("Builder constructed: "+ house.toString());

        engineer = new CivilEngineer();
        engineer.constructTipiHouse();
        house = engineer.getHouse() ;
        System.out.println("Builder constructed: "+ house.toString());
    }
}
