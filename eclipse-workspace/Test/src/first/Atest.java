package first;
import java.util.*;

public class Atest {

    public static void main(String[] args) {
        double sum = 1;
        double pers = 100/100;
        double goal = 8;
        double dep = 0;
        int answer = 0;
        while (sum < goal) {
            answer++;
        //    dep += sum;
            System.out.println("dep = " + dep);
            double a = sum * pers;
            System.out.println("a = " + a);
            sum += a;
            System.out.println("sum+a = " + sum);
        }
        System.out.print(answer);
   }
}