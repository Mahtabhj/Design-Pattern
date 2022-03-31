package Observer;

public class SMSObj implements IObserver {
    @Override
    public void getNotifications() {
        System.out.println("Get notifications by SMS");
    }
}
