public class indexOfMax {
    public static int indexOfMaxMethod(int[] numbers) {
        int result = 0;
        int maxVal = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxVal) {
                maxVal = numbers[i];
                result = i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] test = {3, 7, 1, 9, 12};

        System.out.println(indexOfMaxMethod(test));
    }
}
