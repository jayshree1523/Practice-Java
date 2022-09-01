public class CheckArray {
    public static boolean sorted(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1])
                return false;
        }
        return true;
    }

    public static void main(String args[]) {
        int a[] = { 8, 9, 10, 11, 12 };
        System.out.print(sorted(a));

    }
}
