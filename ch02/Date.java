
public class Date {
    public static void main(String [] args) {
        String day = "Monday, ";
        int date = 1;
        String month = "March ";
        int year = 2026;

        System.out.println("American format: " + day + month + date + ", " + year);
        System.out.println("European format: " + day + date + " " + month + year);
    }
}
