package source;

import answers.Question2;
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
//        int f = Question2.equallyBalancedCashFlow(new int[]{66, 293, 215, 188, 147, 326, 449, 162, 46, 350}, new int[]{170, 153, 305, 290, 187});
//        int g = Question2.equallyBalancedCashFlow(new int[]{189, 28}, new int[]{43, 267, 112, 166});
//        int h = Question2.equallyBalancedCashFlow(new int[]{72, 24, 73, 4, 28, 56, 1, 43}, new int[]{27});
//        System.out.println(f);
//        System.out.println(g);
//        System.out.println(h);
//
        SpringApplication.run(Main.class, args);
    }
}
