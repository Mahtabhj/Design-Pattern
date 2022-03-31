package Observer;

public class AccountObj implements IObserver {
    @Override
    public void getNotifications() {
        System.out.println("Get notifications by Account");

    }
}
