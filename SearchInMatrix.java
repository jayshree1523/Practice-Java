
public class SearchInMatrix {
    static boolean search(int[][] a, int key) {
        // System.out.println(a.length);
        int row = 0;
        int col = a.length - 1;
        while (row < a.length && col >= 0) {
            if (a[row][col] == key)
                return true;
            else if (key > a[row][col])
                row++;
            else
                col--;
        }
        return false;
    }

    public static void main(String args[]) {
        int a[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int key = 0;
        System.out.println(search(a, key));
    }
}
