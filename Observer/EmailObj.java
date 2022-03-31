package Observer;

public class EmailObj implements IObserver {
    @Override
    public void getNotifications() {
        System.out.println("Get notifications by Email");

    }
}
