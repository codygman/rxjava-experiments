package hello;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;

public class HelloWorld {

    public static void main(String[] args) {

        Observable<String> myObservable = Observable.just("Hello, world!");
    
        Subscriber<String> mySubscriber = new Subscriber<String>() {
	    @Override
	    public void onNext(String s) { System.out.println(s);}
    
	    @Override
	    public void onCompleted() {}
    
	    @Override
	    public void onError(Throwable e) {}
        };
    
        myObservable.subscribe(mySubscriber);

    }
}
