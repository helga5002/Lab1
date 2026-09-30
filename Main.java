import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        double x = in.nextDouble();
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = in.nextDouble();
        if (x < a) out.println(1);
        else {
            if (x < b) out.println(2);
            else {
                if (x < c) out.println(3);
                else {
                    if (x < d) out.println(4);
                    else out.println(5);
                }
            }
        }
    }
}

