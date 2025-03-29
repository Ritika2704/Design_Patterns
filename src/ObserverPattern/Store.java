package ObserverPattern;

import ObserverPattern.Observable.IphoneObservableImpl;
import ObserverPattern.Observable.StockObservable;
import ObserverPattern.Observer.EmailAlertObserverImpl;
import ObserverPattern.Observer.MobileAlertObservableImpl;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args){
        StockObservable iphonStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("abc@gmail.com", iphonStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("abc2@gmail.com", iphonStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObservableImpl("abc_username", iphonStockObservable);

        iphonStockObservable.add(observer1);
        iphonStockObservable.add(observer2);
        iphonStockObservable.add(observer3);

        iphonStockObservable.setStockCount(10);
    }
}
