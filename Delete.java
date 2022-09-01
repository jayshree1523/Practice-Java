// TC : O(N)
// SC : O(1)

public class Delete {
    public static void delete(int a[], int key) {
        int n = a.length;
        int i = 0;

        for (; i < n; i++) {
            if (a[i] == key)
                break;
        }
        // if(i == n) return n;
        for (int j = i; j < n - 1; j++) {
            a[j] = a[j + 1];
        }
        // return n-1;
    }

    public static void main(String[] args) {

        int a[] = { 2, 1, 4, 5, 3 };
        int key = 1;
        delete(a, key);
        for (int e : a) {
            System.out.print(e + " ");
        }

    }
}
