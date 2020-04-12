package app.cars;

import org.springframework.stereotype.Component;

import app.interfaces.Car;
@Component("corola")
public class Corola implements Car {

	public String specs() {
		
		return "Limousine from Toyota";
	}

}
