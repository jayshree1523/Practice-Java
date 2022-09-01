// Find the number of path in n*m matrix
// TC : O(2^N)
public class FindPathInMatrix {
    static int NumberOfPath(int n, int m) {
        if (n == 1 || m == 1)
            return 1;
        int rightSide = NumberOfPath(n, m - 1);
        int leftSide = NumberOfPath(n - 1, m);
        return rightSide + leftSide;
    }

    public static void main(String[] args) {
        System.out.println(NumberOfPath(2, 4));
    }
}
