package pl.sda.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("pl.sda.model")
@EnableJpaRepositories("pl.sda.repository")
@ComponentScan("pl.sda")
@Import(SecurityConfiguration.class)
@SpringBootApplication
public class ShopProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopProjectApplication.class, args);
	}

}
