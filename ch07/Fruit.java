/**
 * Fruit exercise.
 */
public class Fruit {

    // Multiplication of all elements
    public static int banana(int[] a) {
        int kiwi = 1; // counter
        int i = 0; // beginner
        while (i < a.length) {
            kiwi = kiwi * a[i];
            i++;
        }
        return kiwi;
    }

    // Looking for the number in the array;
    public static int grapefruit(int[] a, int grape) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == grape) {
                return i;
            }
        }
        return -1;
    }

    // Counting how many number appears in the array that we are looking for;
    public static int pineapple(int[] a, int apple) {
        int pear = 0;
        for (int pine: a) {
            if (pine == apple) {
                pear++;
            }
        }
        return pear;
    }
}
