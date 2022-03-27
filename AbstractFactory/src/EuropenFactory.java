public class EuropenFactory extends AbstractFactory{
    @Override
    public Train createTrain() {
        return new EuropenTrain();
    }
}
