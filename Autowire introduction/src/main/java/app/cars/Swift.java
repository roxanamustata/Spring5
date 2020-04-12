package app.cars;

import org.springframework.stereotype.Component;

import app.interfaces.Car;

@Component("swift")
public class Swift implements Car {

	@Override
	public String specs() {
		
		return "Hatchback from Suzuki";
	}

}
