//import java.util.HashSet;
//import java.util.*;

public class Subarray0Sum {
    static boolean SubarrayWith0Sum(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int sum = a[i];
            for (int j = i + 1; j < n; j++) {
                sum += a[j];
                if (sum == 0)
                    return true;

            }

        }
        return false;

        // Set<Integer> set = new HashSet<>();
        // int sum = 0;
        // for (int i = 0; i < n; i++) {
        // sum += a[i];
        // if (set.contains(sum))
        // return true;
        // else
        // set.add(sum);
        // }
        // return false;

    }

    public static void main(String[] args) {
        int[] a = { 2, 3, 1, -4, 4, 2 };
        System.out.println(SubarrayWith0Sum(a));
    }
}
