import java.util.*;

// Find two numbers in a sorted array with the given sum
public class TragetSum {
    // Brouteforce approach
    // static void FindNo(int[] a, int sum) { // TC : O(N2)
    // for (int i = 0; i < a.length; i++) {
    // for (int j = i + 1; j < a.length; j++) {
    // if (a[i] + a[j] == sum)
    // System.out.println(a[i] + " " + a[j]);
    // }
    // }
    // }

    // Second approach .............. O(N)

    static boolean FindThreeNo(int[] a, int sum) {
        int n = a.length;
        Arrays.sort(a);
        for (int i = 0; i < n - 2; i++) {
            boolean found = FindNo(a, sum - a[i], i + 1);
            if (found)
                return true;
        }
        return false;
    }

    static boolean FindNo(int[] a, int sum, int l) {
        int r = a.length - 1;
        while (l < r) {
            int currSum = a[l] + a[r];
            if (currSum > sum)
                r--;
            else if (currSum < sum)
                l++;
            else
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int a[] = { 3, 2, 7, 8, 10, 12 };
        // System.out.println(FindNo(a, 12, 0));

        System.out.println(FindThreeNo(a, 12));

    }
}
