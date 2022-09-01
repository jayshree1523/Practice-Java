public class Consecutives1 {
    static int CountConsecutive(int[] a) {
        int count = 0, maxx = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1)
                count++;
            else if (a[i] == 0)
                count = 0;
            maxx = Math.max(count, maxx);
        }
        return maxx;
    }

    public static void main(String args[]) {
        int a[] = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1 };
        int ans = CountConsecutive(a);
        System.out.println(ans);
    }
}
