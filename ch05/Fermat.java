import java.util.Scanner;

public class Fermat {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int n;

        Scanner in = new Scanner(System.in);
        System.out.print("What's your 'a' number? ");
        a = in.nextInt();
        System.out.print("What's your 'b' number? ");
        b = in.nextInt();
        System.out.print("What's your 'c' number? ");
        c = in.nextInt();
        System.out.print("What's your 'n' number? ");
        n = in.nextInt();

        boolean result = Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n);

        if (n > 2 && result) {
            System.out.println("Holy smokes, Fermat was wrong!");
        } else {
            System.out.println("No, that doesn't work.");
        }
    }
}
