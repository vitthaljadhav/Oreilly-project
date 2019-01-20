package guru.springframework.Didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.Didemo.controller.MyController;

@SpringBootApplication
public class DiDemoApplication {
	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(DiDemoApplication.class, args);
	MyController cntoller = ctx.getBean("myController",MyController.class);
	cntoller.hello();
	}
}

