/**
 * Stack diagram exercise.
 */
public class MakeDubMus {

    public static int[] make(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        return a;
    }

    // Multiplies each number to 2;
    public static void dub(int[] jub) {
        for (int i = 0; i < jub.length; i++) {
            jub[i] *= 2; //
        }
    }

    // Addition of the array zoo;
    public static int mus(int[] zoo) {
        int fus = 0;
        for (int i = 0; i < zoo.length; i++) {
            fus += zoo[i];
        }
        return fus;
    }

    public static void main(String[] args) {
        int[] bob = make(5); // [1, 2, 3, 4, 5]
        dub(bob); // [2, 4, 8, 16, 32]
        System.out.println(mus(bob)); //
    }

}
