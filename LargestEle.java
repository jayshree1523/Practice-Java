
// largest element in an array
public class LargestEle {
    public static int MaxOf(int a[]) {
        if (a.length == 0)
            return -1;
        int maxInd = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[maxInd]) {
                maxInd = i;
            }
        }
        return maxInd;
    }

    public static void main(String[] args) {
        // System.out.println("Hello World");

        int a[] = { 1, 0, 8, 9, 7, 3 };
        int ans = MaxOf(a);
        System.out.println(a[ans]);

    }

}
