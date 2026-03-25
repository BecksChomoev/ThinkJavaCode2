public class Ex_6_2_SquareRoot {
    public static void main(String[] a) {
        System.out.println(squareRoot(9));    // should be ~3.0
        System.out.println(squareRoot(25));   // should be ~5.0
        System.out.println(squareRoot(2));    // should be ~1.4142
    }

    public static double squareRoot(double a) {
        double x = a /2;

        while (true) {
            double next = (x + a / x) / 2;

            if (Math.abs(next - x) < 0.0001) {
                return next;
            }

            x = next;
        }
    }
}
