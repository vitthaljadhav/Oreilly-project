package todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/hello")
	public String doHello() {
		return "hello";
	}
	
	@RequestMapping("/outside")
	public String doOutSide() {
		
		return "outside";
	}

}
