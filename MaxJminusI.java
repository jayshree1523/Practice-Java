public class MaxJminusI {
    // Given array , find the maximum j -i such that arr[j] > arr[i];
    // BrouteForce approach
    // static int Maximum(int[] a) {
    // int ans = 0;
    // for (int i = 0; i < a.length; i++) {
    // for (int j = i + 1; j < a.length; j++) {
    // if (a[j] > a[i])
    // ans = Math.max(ans, j - i);
    // }
    // }
    // return ans;
    // }

    // second solution
    static int Maximum(int[] a) {
        int n = a.length;
        int leftMin[] = new int[n];
        int rightMax[] = new int[n];

        leftMin[0] = a[0];
        for (int i = 1; i < n; i++) {
            leftMin[i] = Math.min(leftMin[i - 1], a[i]); // 5 4 1 1 1 1 1 1 1
        }

        rightMax[n - 1] = a[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], a[i]); // 8 8 8 8 8 8 6 4 4
        }

        int i = 0, j = 0, ans = 0;
        while (i < n && j < n) {
            if (leftMin[i] < rightMax[j]) {
                ans = Math.max(ans, j - i);
                j++;
            } else
                i++;
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] a = { 5, 4, 1, 7, 2, 8, 6, 3, 4 };
        int res = Maximum(a);
        System.out.println(res);
    }
}
