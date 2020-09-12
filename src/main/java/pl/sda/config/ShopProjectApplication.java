package pl.sda.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("pl.sda")
@SpringBootApplication
public class ShopProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopProjectApplication.class, args);
	}

}
