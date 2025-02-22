package br.com.jhemeson.webfluxcourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "br.com.jhemeson.webfluxcourse")
public class WebfluxCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebfluxCourseApplication.class, args);
	}

}
