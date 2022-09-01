public class Container {
    static int ContainerWithMaxWater(int[] a) {
        int maxArea = 0;
        int l = 0;
        int r = a.length - 1;
        while (l < r) {
            int height = Math.min(a[l], a[r]);
            int distance = l - r;
            int area = height * distance;
            maxArea = Math.max(maxArea, area);
            if (a[l] < a[r])
                l++;
            else
                r--;
        }
        return maxArea;
    }

    public static void main(String args[]) {
        int a[] = { 8, 9, 10, 11, 12 };
        int ans = ContainerWithMaxWater(a);
        System.out.println(ans);

    }

}