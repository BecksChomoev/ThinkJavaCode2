public class DateFromSecondChapter_4_1 {
    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println("American format: " + day + ", " + month + " " + date + ", " + year);
    }

    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println("European format: " + day + " " + date + ", " + month + " " + year);
    }

    public static void main(String [] args) {
        String day = "Monday";
        int date = 9;
        String month = "March";
        int year = 2026;

        printAmerican(day, date, month, year);
        printEuropean(day, date, month, year);
    }
}
