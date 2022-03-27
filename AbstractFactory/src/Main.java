public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new EuropenFactory();
        Train train = abstractFactory.createTrain();
        System.out.println(train.getClass());
    }
}
