package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class MobileAlertObservableImpl implements NotificationAlertObserver{

    String username;
    StockObservable observable;

    public MobileAlertObservableImpl(String username, StockObservable observable){
        this.observable = observable;
        this.username = username;
    }
    @Override
    public void update() {
        sendMsgOnMobile(username, "Product is in the stock hurry up!");
    }
    private void sendMsgOnMobile(String username, String msg){
        System.out.println("msg sent to: "+ username);
    }
}
