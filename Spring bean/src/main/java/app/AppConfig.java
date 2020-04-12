package app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


import app.cars.Corola;
import app.cars.Swift;
import app.specs.EngineType;

@Configuration
@ComponentScan("app")
public class AppConfig {

	@Bean("myCorola")
	public Corola corola() {
		return new Corola();
	}
	
	@Bean("swift")
	public Swift swift() {
		return new Swift();	
	}
	
	
	@Bean("engineType")
	public EngineType engineType() {
		return new EngineType();
	}
//	
//	@Bean("V8Engine")
//	public V8 v8() {
//		return new V8();
//	}
	
	
}
