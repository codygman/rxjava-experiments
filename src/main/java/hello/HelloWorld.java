package hello;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;
import rx.functions.Func1;

public class HelloWorld {

    public static void main(String[] args) {

        Observable.just("Hello, world!")
	    .map(new Func1<String, String>() {
		    @Override
		    public String call(String s) {
			return s + " -Cody";
		    }
		})
	    .subscribe(
            new Action1<String>() {
	        @Override
	        public void call(String s) {
		    System.out.println(s);
	        }
        });
    }
}
