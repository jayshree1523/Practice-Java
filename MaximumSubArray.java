// public class MaximumSubArray {
//     static int SubArray(int a[]) {
//         int CurrSum = 0;
//         int maxSum = -465876709;
//         for (int i = 0; i < a.length; i++) {
//             CurrSum += a[i];
//             if (CurrSum > maxSum)
//                 maxSum = CurrSum;
//             if (CurrSum < 0)
//                 CurrSum = 0;
//         }
//         return maxSum;
//     }

//     public static void main(String args[]) {
//         int a[] = { -9, -4, 2, -7, 4 };
//         int ans = SubArray(a);
//         System.out.println(ans);
//     }
// }

//Mininum subarray 

public class MaximumSubArray {
    static int SubArray(int[] a) {
        int CurrSum = 0;
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            CurrSum += a[i];
            if (CurrSum < minSum)
                minSum = CurrSum;
        }
        return minSum;
    }

    public static void main(String args[]) {
        int a[] = { -9, 4, 2, -7, -4 };
        int ans = SubArray(a);
        System.out.println(ans);
    }

}