package Task2_Quadratic_Equation_with_OOP_basics;

public class Arguments {

    private static float a;
    private static float b;
    private static float c;

    public Arguments(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static float getA() {
        return a;
    }

    public static float getB() {
        return b;
    }

    public static float getC() {
        return c;
    }
}
