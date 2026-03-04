public class Time {
    public static void main(String[] args) {
        int hour = 22;
        int minute = 44;
        int second = 59;

        int secondsSinceMidNight = (22 * 60 * 60) + 59;
        System.out.println(secondsSinceMidNight);

        int secondsRemaining = (24 * 60 * 60) - secondsSinceMidNight;
        System.out.println(secondsRemaining);

        double percentagePast = (secondsSinceMidNight * 100.0) / (24.0 * 60.0 * 60.0);
        System.out.println(percentagePast);
    }
}
