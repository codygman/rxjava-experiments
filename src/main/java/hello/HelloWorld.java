package hello;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;

public class HelloWorld {

    public static void main(String[] args) {

        Observable<String> myObservable = Observable.just("Hello, world!");
    
	Action1<String> onNextAction = new Action1<String>() {
	    @Override
	    public void call(String s) {
		System.out.println(s);
	    }
	};
    
        myObservable.subscribe(onNextAction);

    }
}
