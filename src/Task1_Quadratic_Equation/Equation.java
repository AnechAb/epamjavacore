package Task1_Quadratic_Equation;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        eq();
    }

    public static void eq() {
        double a, b, c, D;
        System.out.println("Enter a, b and c separated by space: ");

        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("x = " + x);
        }
        else {
            System.out.println("Discriminant is negative. Try with another values.");
        }
    }
}
