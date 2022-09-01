// public class Reverse {
// public static void reverseArray(int a[]) {
// int n = a.length, temp;
// for (int i = 0; i < n / 2; i++) {
// temp = a[i];
// a[i] = a[n - i - 1];
// a[n - i - 1] = temp;
// }
// for (int j = 0; j < n; j++) {
// System.out.println(a[j] + " ");
// }

// }

// public static void main(String args[]) {
// int a[] = { 9, 4, 8, 2, 4 };
// reverseArray(a);
// }
// }

public class Reverse {
    public static void reverseArray(int a[]) {
        int n = a.length;
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");

        }

    }

    public static void main(String args[]) {
        int a[] = { 9, 4, 8, 2, 4 };
        reverseArray(a);
    }
}
