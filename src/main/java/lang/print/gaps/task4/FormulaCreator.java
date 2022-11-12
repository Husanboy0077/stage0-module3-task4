package lang.print.gaps.task4;
import java.util.Scanner;
public class FormulaCreator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double x,a,b;
        a=sc.nextDouble();
        b=sc.nextDouble();
        x=(9 * Math.pow(a, 2) - 5 * b + 2 + a - 7) * ((a + b - 4 * a * b) / 2);
        System.out.println(x);
    }
}
