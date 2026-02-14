package sec04.chap05;

public class Ex01 {
    public static void main(String[] args) {
        double x = 3, y = 4;

        System.out.printf("%f + %f = %f%n", x, y, x + y);
        System.out.printf("%f - %f = %f%n", x, y, x - y);
        System.out.printf("%f * %f = %f%n", x, y, x * y);
        System.out.printf("%f / %f = %f%n", x, y, x / y);

        x = 10; y = 2;

        System.out.printf("%f + %f = %f%n", x, y, x + y);
        System.out.printf("%f - %f = %f%n", x, y, x - y);
        System.out.printf("%f * %f = %f%n", x, y, x * y);
        System.out.printf("%f / %f = %f%n", x, y, x / y);

        x = 7; y = 5;

        System.out.printf("%f + %f = %f%n", x, y, x + y);
        System.out.printf("%f - %f = %f%n", x, y, x - y);
        System.out.printf("%f * %f = %f%n", x, y, x * y);
        System.out.printf("%f / %f = %f%n", x, y, x / y);

        System.out.println("\n- - - - -\n");

        double xx = 3, yy = 4;
        addSubtMultDiv(xx, yy);

        xx = 10; yy = 2;
        addSubtMultDiv(xx, yy);

        xx = 7; yy = 5;
        addSubtMultDiv(xx, yy);
    }

    static void addSubtMultDiv (double a, double b) {
        System.out.printf("%f + %f = %f%n", a, b, a + b);
        System.out.printf("%f - %f = %f%n", a, b, a - b);
        System.out.printf("%f * %f = %f%n", a, b, a * b);
        System.out.printf("%f / %f = %f%n", a, b, a / b);
    }
}
