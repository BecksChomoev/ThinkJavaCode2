import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number ");
        if (!in.hasNextInt()) {
            System.out.println("Error: \"" + in.next() + "\" is not a valid integer.");
            return;
        }
        a = in.nextInt();

        System.out.print("Enter a number ");
        if (!in.hasNextInt()) {
            System.out.println("Error: \"" + in.next() + "\" is not a valid integer.");
            return;
        }
        b = in.nextInt();

        System.out.print("Enter a number ");
        if (!in.hasNextInt()) {
            System.out.println("Error: \"" + in.next() + "\" is not a valid integer.");
            return;
        }
        c = in.nextInt();

        double discriminant = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("The value of 'a' cannot be zero.");
        } else if (discriminant < 0) {
            System.out.println("No real solutions.");
        } else {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
