package source;

import answers.Question3;
import answers.Question4;
import controllers.Question1Controller;
import helpers.Edge;
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
//        int a = Question4.selectionFailedTradedesks(new String[][]{{"1","1","X", "X", "2"}, {"2", "3", "X"}, {"X", "3", "1","2"}}, 1);
//        int b = Question6.shortestServerRoute(3, 1, new int[][]{{0,7,4},{7,0,2},{4,2,0}}); // = 6
//        int c = Question3.lowestExposureToExchanges(3, new Edge[]{new Edge(new int[]{1, 2}), new Edge(new int[]{2, 3})});
//        int d = Question3.lowestExposureToExchanges(5, new Edge[]{
//                new Edge(new int[]{1, 2}),
//                new Edge(new int[]{1, 3}),
//                new Edge(new int[]{1, 4}),
//                new Edge(new int[]{1, 5})
//        }); // = 3
//        int e = Question3.lowestExposureToExchanges(5, new Edge[]{
//                new Edge(new int[]{1, 3}),
//                new Edge(new int[]{1, 4}),
//                new Edge(new int[]{1, 5}),
//                new Edge(new int[]{2, 3}),
//                new Edge(new int[]{2, 4}),
//                new Edge(new int[]{2, 5})
//        }); // = 1
//        System.out.println(a);
        SpringApplication.run(Main.class, args);
    }
}
