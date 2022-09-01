// public class TrappingRainWater {
//     static int TrappingWater(int a[]) {
//         int n = a.length;
//         int left[] = new int[n];
//         int right[] = new int[n];

//         // left array
//         left[0] = a[0];
//         for (int i = 1; i < n; i++) {
//             left[i] = Math.max(left[i - 1], a[i]);
//         }

//         // right array
//         right[n - 1] = a[n - 1];
//         for (int i = n - 2; i >= 0; i--) {
//             right[i] = Math.max(right[i + 1], a[i]);
//         }

//         int ans = 0;
//         for (int i = 0; i < n; i++) {
//             ans += Math.min(left[i], right[i]) - a[i];
//         }
//         return ans;
//     }

//     public static void main(String args[]) {
//         int a[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
//         int res = TrappingWater(a);
//         System.out.println(res);
//     }

// }

// TC : O(N)..... SC : O(N)

// Trapping rain water using O(1) space complexity>>>>>>>>>>>>>
public class TrappingRainWater {
    static int TrappingWater(int a[]) {
        int l = 0, r = a.length - 1;
        int leftMax = 0, rightMax = 0, ans = 0;
        while (l < r) {
            if (a[l] <= a[r]) {
                if (a[l] > leftMax)
                    leftMax = a[l];
                else
                    ans += (leftMax - a[l]);
                l++;
            } else {
                if (a[r] > rightMax)
                    rightMax = a[r];
                else
                    ans += (rightMax - a[r]);
                r--;
            }
        }
        return ans;

    }

    public static void main(String args[]) {
        int a[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int res = TrappingWater(a);
        System.out.println(res);
    }

}