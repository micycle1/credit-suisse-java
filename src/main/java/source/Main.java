package source;

import answers.Question4;
import controllers.Question1Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackageClasses = Question1Controller.class)
public class Main {
    public static void main(String[] args) {
//		int x = Question1.bestMergedPortfolio(new int[]{15, 8, 6, 7});
//        int y = Question5.shareExchange(new int[]{1,4,2}, 3);
//        int z = Question4.selectionFailedTradedesks(new String[][]{
//                {"12", "12", "3", "4", "3"},
//                {"23", "X", "X", "X", "3"},
//                {"33", "21", "X", "X", "X"},
//                {"9", "12", "3", "X", "X"},
//                {"X", "X", "X", "4", "5"}
//        }, 2);
//        int a = Question4.selectionFailedTradedesks(new String[][]{{"X", "X", "2"}, {"2", "3", "X"}, {"X", "3", "2"}}, 3);
//        System.out.println(a);
        SpringApplication.run(Main.class, args);
    }
}
