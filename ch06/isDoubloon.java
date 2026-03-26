public class isDoubloon {
    public static boolean doubloon(String s) {
        String lower = s.toLowerCase();
        int[] counts = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char letter = lower.charAt(i);
            int index = letter - 'a';
            counts[index]++;
        }

        for (int count:counts) {
            if (count != 0 && count != 2) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(doubloon("beriberi"));
        System.out.println(doubloon("boob"));
        System.out.println(doubloon("tit"));
        System.out.println(doubloon("Caucasus"));
    }
}
