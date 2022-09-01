public class RightGreatest {
    static void Check(int[] a) {
        int n = a.length;
        int[] ans = new int[n];
        ans[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            ans[i] = Math.max(ans[i + 1], a[i]);
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static void main(String args[]) {
        int a[] = { 7, 5, 8, 9, 6, 8, 5, 7, 4, 6 };
        Check(a);
    }
}
