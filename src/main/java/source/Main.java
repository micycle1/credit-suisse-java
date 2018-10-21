package source;

import answers.Question1;
import answers.Question4;
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
//        int y = Question5.shareExchange(new int[]{1,4,2}, 3);
//        int z = Question4.selectionFailedTradedesks(new String[][]{
//                {"12", "12", "3", "X", "3"},
//                {"23", "X", "X", "X", "3"},
//                {"33", "21", "X", "X", "X"},
//                {"9", "12", "3", "X", "X"},
//                {"X", "X", "X", "4", "5"}
//        }, 3);
//        System.out.println(z);
        SpringApplication.run(Main.class, args);
    }
}
