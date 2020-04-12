package app.specs;

import org.springframework.stereotype.Component;

import app.interfaces.Engine;

@Component("V8Engine")
public class V8 implements Engine {

	
	public String type() {
		
		return "V8 engine";
	}

}
