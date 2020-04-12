package app.specs;

import org.springframework.stereotype.Component;

import app.interfaces.Engine;

@Component("V6Engine")
public class V6 implements Engine {

	public String type() {
		
		return "V6 engine";
	}

}
