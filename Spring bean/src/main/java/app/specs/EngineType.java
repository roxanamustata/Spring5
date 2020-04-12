package app.specs;

import org.springframework.stereotype.Component;

import app.interfaces.Engine;


public class EngineType implements Engine {

	String type;
	
	public EngineType() {
		type="unknown";
	}


	public EngineType(String type) {
		this.type = type;
	}


	public String type() {
		return type;
	}

}
