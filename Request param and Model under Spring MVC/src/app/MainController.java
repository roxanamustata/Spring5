package app;



import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class MainController {
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String welcome(){
		return "Hello";
		
	}
	
	
	@GetMapping("displayname")
	public  ModelAndView displayName(@RequestParam("firstName") String firstName) {
		
		ModelAndView modelAndView =  new ModelAndView("displayName");
		Date date= new Date(0);
				
		List<String> names = new ArrayList<>();
		names.add("Ralu");
		names.add("Tani");
		names.add("Vane");
		names.add("Cip");
		
		modelAndView.addObject("date",date);
		modelAndView.addObject("name", firstName);
		modelAndView.addObject("team", names);
		
		return modelAndView;
		
	}

}
