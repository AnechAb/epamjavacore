package Task1_Quadratic_Equation;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        resolve();
    }

    public static void resolve() {
        double a = 1;
        double b = 4;
        double c = 4;
        double descriminant;

        descriminant = b * b - 4 * a * c;
        if (descriminant > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(descriminant)) / (2 * a);
            x2 = (-b + Math.sqrt(descriminant)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }
        else if (descriminant == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("x = " + x);
        }
        else {
            System.out.println("No solutions.");
        }
    }
}
