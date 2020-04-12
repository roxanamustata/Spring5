package app.cars;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import app.interfaces.Car;
import app.interfaces.Engine;

//@Component("corola")
public class Corola implements Car {

	@Autowired
	@Qualifier("engineType")
	Engine engine;
	


	public String specs() {
		String specs="Limousine from Toyota with engine type "+engine.type();		
		return specs;
	}



}
