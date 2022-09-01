public class Transpose {
    static void transposeOfMatrix(int a[][]) {
        int n = a.length;
        int i = 0, j = 0;
        for (i = 0; i < n; i++) {
            for (j = i; j < n; j++) {
                int swap = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = swap;
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    static void RotateMatrix(int a[][]) {
        int n = a.length;
        transposeOfMatrix(a);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int swap = a[i][j];
                a[i][j] = a[i][n - j - 1];
                a[i][n - j - 1] = swap;
            }
        }
    }

    static void PrintMatrix(int a[][]) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String args[]) {
        int a[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // transposeOfMatrix(a);
        RotateMatrix(a);
        PrintMatrix(a);

    }
}
