package main.java.spring.tdd.dao.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@PropertySource(value = { "classpath:SpringTDD_DB.properties" })
@ImportResource(value = { "classpath:SpringTDD_DB.xml" })
@ComponentScan(basePackages= {"main.java"})
public class DaoConfig {

	@Value("${jdbc.spirngtdd.datasource}")
	String valueTest;

	@PostConstruct
	public void test() {
		System.out.println(valueTest);
	}
}
