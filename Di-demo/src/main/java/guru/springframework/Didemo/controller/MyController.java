package guru.springframework.Didemo.controller;

import static org.mockito.Mockito.never;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	public String hello() {
		System.out.println("hello");
		return "todo";
	}
}
