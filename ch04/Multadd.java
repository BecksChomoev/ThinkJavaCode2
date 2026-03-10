public class Multadd {
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    public static double expSum(double x) {
        return multadd(x, Math.exp(-x), Math.sqrt(1 - Math.exp(-x)));
    }

    public static void main(String[] args) {
        System.out.println(multadd(1.0, 2.0, 3.0));

        double val1 = multadd(Math.sin(Math.PI / 4), 1.0, Math.cos(Math.PI / 4) / 2);
        System.out.println(val1);

        double val2 = multadd(1.0, Math.log(10), Math.log(20));
        System.out.println(val2);

        System.out.println(expSum(1.0));
        System.out.println(expSum(2.0));
    }
}
