package mum.swe.democrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("mum.swe.democrud")
public class MyProductsMgmtWebApp {

	public static void main(String[] args) {
		SpringApplication.run(MyProductsMgmtWebApp.class, args);
	}
}
