import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number ");
        if (!in.hasNextInt()) {
            System.out.println("Error: \"" + in.next() + "\" is not a valid integer.");
            return;
        }
        int a = in.nextInt();
        if (a <= 0) {
            System.err.println("Error: " + a + " is less than or equal to 0.");
            return;
        }

        System.out.print("Enter a number ");
        if (!in.hasNextInt()) {
            System.out.println("Error: \"" + in.next() + "\" is not a valid integer.");
            return;
        }
        int b = in.nextInt();
        if (b <= 0) {
            System.err.println("Error: " + b + " is less than or equal to 0.");
            return;
        }

        System.out.print("Enter a number ");
        if (!in.hasNextInt()) {
            System.out.println("Error: \"" + in.next() + "\" is not a valid integer.");
            return;
        }
        int c = in.nextInt();
        if (c <= 0) {
            System.err.println("Error: " + c + " is less than or equal to 0.");
            return;
        }

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Yes, these sides can form a triangle.");
        } else {
            System.out.println("No, these sides cannot form a triangle.");
        }
    }
}
