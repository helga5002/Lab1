import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        // вводим значение точки Х
        double x = in.nextDouble();
        // вводим значения A, B, C и D
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = in.nextDouble();
        // проверка выполнения условия A < B < C < D
        if (a >= b || b >= c || c >= d) out.println("Входные данные не соответстуют условию, попробуйте еще раз");
        else {
            // иначе, проверка выполнения условия X≠A, X≠B, X≠C, X≠D
            if (x == a || x == b || x == c || x == d) out.println("Входные данные не соответстуют условию, попробуйте еще раз");
            else {
                // иначе, проверка на попадание в участок 1
                if (x < a) out.println(1);
                else {
                    // иначе, проверка на попадание в участок 2
                    if (x < b) out.println(2);
                    else {
                        // иначе, проверка на попадание в участок 3
                        if (x < c) out.println(3);
                        else {
                            // иначе, проверка на попадание в участок 4
                            if (x < d) out.println(4);
                            // иначе, попадание в участок 5
                            else out.println(5);
                        }
                    }
                }
            }
        }
    }
}
