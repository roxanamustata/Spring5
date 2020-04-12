package app.cars;

import javax.print.attribute.standard.MediaSize.Engineering;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import app.interfaces.Car;
import app.interfaces.Engine;
@Component("corola")
public class Corola implements Car {

	@Autowired
	@Qualifier("V6Engine")
	Engine engine;
	
//	@Autowired
//	public void setEngine(Engine engine) {
//		engine.type= "New V8 Engine";
//		this.engine = engine;
//	}

//	@Autowired
//	public Corola(Engine engine) {
//		engine.type="New V8 engine";
//		this.engine = engine;
//	}

	public String specs() {
		String specs="Limousine from Toyota with engine type"+engine.type();		
		return specs;
	}



}
