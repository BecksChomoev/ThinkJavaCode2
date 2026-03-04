import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        double celsius;
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a temperature in Celsius: ");
        celsius = userInput.nextDouble();
        double Fahrenheit = (celsius * 9/5) + 32;

        System.out.printf("%.1f C = %.2f F\n", celsius, Fahrenheit);
    }
}
