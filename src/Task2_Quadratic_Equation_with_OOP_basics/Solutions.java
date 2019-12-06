package Task2_Quadratic_Equation_with_OOP_basics;

public class Solutions {
    private float x, x1, x2;
    static float a = Arguments.getA();
    static float b = Arguments.getB();
    static float c = Arguments.getC();
    public Solutions(float x){
        this.x = x;
    }
    public Solutions(float x1, float x2){
        this.x1 = x1;
        this.x2 = x2;
    }
    public static Solutions getSolutions() {
        return solutions;
    }

/*    public float getX() {
        return x;
    }

    public float getX1() {
        return x1;
    }

    public float getX2() {
        return x2;
    }*/


    public static Solutions resolve() {
        float discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            float x1, x2;
            x1 = (float) ((-b - Math.sqrt(discriminant)) / (2 * a));
            x2 = (float) ((-b + Math.sqrt(discriminant)) / (2 * a));
            return new Solutions(x1, x2);
        } else if (discriminant == 0) {
            float x;
            x = -b / (2 * a);
            return new Solutions(x);
        } else {
            return null;
        }
    }
    static Solutions solutions = resolve();
}

