package app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.cars.Corola;
import app.cars.Swift;
import app.interfaces.Car;

public class App {
public static void main(String[] args) {
	Car swift = new Swift();
	Car corola=new Corola();
//	System.out.println(swift.specs());
//	System.out.println(corola.specs());
//Car myCar = new Swift();
//System.out.println(myCar.specs());

AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
Car myCar=context.getBean("corola",Car.class);
System.out.println(myCar.specs());
context.close();

}
}
