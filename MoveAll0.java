public class MoveAll0 {
    static void MoveEnd(int[] a) {
        int n = a.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != 0)
                a[count++] = a[i];
        }
        while (count < n)
            a[count++] = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + " ");
        }

    }

    public static void main(String args[]) {
        int a[] = { 8, 0, 1, 3, 0, 0, 5 };
        MoveEnd(a);

    }

}
