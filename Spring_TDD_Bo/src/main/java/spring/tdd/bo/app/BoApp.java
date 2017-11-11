package main.java.spring.tdd.bo.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import main.java.spring.tdd.bo.bo.IUserBo;

@SpringBootApplication
@ComponentScan(basePackages= {"main.java"})
public class BoApp implements CommandLineRunner {
	
	@Autowired
	IUserBo userBo;

	public static void main(String[] args) throws Exception {

		SpringApplication.run(BoApp.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		// do something
		userBo.sampleRule();
	}

}
