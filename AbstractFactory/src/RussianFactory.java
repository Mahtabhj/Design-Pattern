public class RussianFactory extends AbstractFactory{
    @Override
    public Train createTrain() {
        return new RussianTrain();
    }
}
