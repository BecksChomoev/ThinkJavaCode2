import java.util.Scanner;

public class Ex_5_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        if (x > 0 && x < 10) {
            System.out.println("positive single digit number");
        }
    }
}