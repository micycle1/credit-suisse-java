package source;

import answers.Question1;
import controllers.Question1Controller;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackageClasses = Question1Controller.class)
public class Main {
	public static void main(String[] args) {
//		int x = Question1.bestMergedPortfolio(new int[]{1,2,31,4,5,60});
//		System.out.println(x);
		SpringApplication.run(Main.class, args);
	}
}
