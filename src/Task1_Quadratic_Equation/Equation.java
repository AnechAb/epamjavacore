package Task1_Quadratic_Equation;

public class Equation {

    public static void resolve(float a, float b, float c) {
        float discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            float x1, x2;
            x1 = (float) ((-b - Math.sqrt(discriminant)) / (2 * a));
            x2 = (float) ((-b + Math.sqrt(discriminant)) / (2 * a));
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }
        else if (discriminant == 0) {
            float x;
            x = -b / (2 * a);
            System.out.println("x = " + x);
        }
        else {
            System.out.println("No solutions");
        }
    }

    public static void main(String[] args) {
        resolve(1,-4, 2);
    }
}
