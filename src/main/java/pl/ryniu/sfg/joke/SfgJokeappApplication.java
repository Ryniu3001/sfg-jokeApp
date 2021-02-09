package pl.ryniu.sfg.joke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class SfgJokeappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SfgJokeappApplication.class, args);
	}

}
