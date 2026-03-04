import java.util.Scanner;

public class SecondsConverter {
    public static void main(String[] args) {
        int hours;
        int minutes;
        int seconds;
        final int Seconds_In_Hour = 3600;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many seconds you want to calculate: ");
        seconds = scanner.nextInt();
        scanner.close();

        hours = seconds / Seconds_In_Hour;
        minutes = (seconds % Seconds_In_Hour) / 60;
        seconds = seconds % 60;

        System.out.printf("%d hours, %d minutes, %d seconds\n", hours, minutes, seconds);
    }
}
