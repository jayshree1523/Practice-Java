public class Smallest {
    public static int smallNo(int a[]) {
        int min = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < a[min]) {
                min = i;
            }
        }
        return min;
    }

    public static void main(String args[]) {
        int a[] = { 8, 2, 7, 5, 9 };
        int ans = smallNo(a);
        System.out.println(a[ans]);
    }
}