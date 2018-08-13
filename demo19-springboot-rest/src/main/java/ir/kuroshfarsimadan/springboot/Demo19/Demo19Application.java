package ir.kuroshfarsimadan.springboot.Demo19;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo19Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cac = SpringApplication.run(Demo19Application.class, args);
		for (String beanNames : cac.getBeanDefinitionNames()) {
			System.out.println("Bean names are: " + beanNames);
		}
	}
}
