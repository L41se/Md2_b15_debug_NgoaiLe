package NumberFormatException;

import java.util.Scanner;

public class CalculationEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x: ");
        int x = scanner.nextInt();
        System.out.println("Input y: ");
        int y = scanner.nextInt();
        CalculationEx calc = new CalculationEx();
        calc.calculate(x, y);
    }

    private void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Sum: x + y = " + a);
            System.out.println("Minus: x - y = " + b);
            System.out.println("Multiply: x * y = " + c);
            System.out.println("Divide: x / y = " + d);
        } catch (Exception e){
            System.out.println("Exception " + e.getMessage());
        }
    }
}

