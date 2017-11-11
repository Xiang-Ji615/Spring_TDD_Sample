package main.java.spring.tdd.dao.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class App implements CommandLineRunner {

	public static void main(String[] args) throws Exception {

		SpringApplication.run(App.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		// do something

	}

}
