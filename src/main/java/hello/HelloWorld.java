package hello;

import org.joda.time.LocalTime;
import rx.Observable;
import rx.functions.Action1;

public class HelloWorld {

    public static void hello(String... names) {
	Observable.from(names).subscribe(new Action1<String>() {
		@Override
		public void call(String s) {
		    System.out.println("Hello " + s + "!");
		}
	});
    }

    
    public static void main(String[] args) {
	hello("Cody", "Amia");
	
	LocalTime currentTime = new LocalTime();
	System.out.println("The current local time is: " + currentTime);
	
	Greeter greeter = new Greeter();
	System.out.println(greeter.sayHello());
    }
}
