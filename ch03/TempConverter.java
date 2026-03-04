import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        double Celsius;
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a temperature in Celsius: ");
        Celsius = userInput.nextDouble();
        double Fahrenheit = (Celsius * 9/5) + 32;

        System.out.printf("%.1f C = %.2f F\n", Celsius, Fahrenheit);
    }
}
