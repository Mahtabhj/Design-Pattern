package Observer;

import java.util.ArrayList;

public class YoutubeChannel {
    ArrayList<IObserver> iObservers=new ArrayList<>(100);

    public void subscribe(IObserver obj){
      iObservers.add(obj);
    }

    public void unSubscribe(IObserver obj2){
        iObservers.remove(obj2);
    }

    public void notifyUser(){
        for(int i=0;i<iObservers.size();i++){
            iObservers.get(i).getNotifications();
        }
    }

    public void videoUpload(){
        System.out.println("Uploading the video");
        notifyUser();
    }

}
