package Observer;

public class TestMain {
    public static void main(String[] args) {
        YoutubeChannel y= new YoutubeChannel();
        y.subscribe(new EmailObj());
        y.subscribe(new SMSObj());
        y.subscribe(new AccountObj());

        y.videoUpload();
    }
}
