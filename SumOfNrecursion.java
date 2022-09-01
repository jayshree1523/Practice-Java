// public class SumOfNrecursion {
//     // TC : O(N) , SC : O(N)
//     static int Sum(int n) {
//         if (n == 0)
//             return 0;

//         int ans = Sum(n - 1);
//         return ans + n;
//     }

//     public static void main(String[] args) {
//         System.out.println(Sum(10));
//     }
// }

// Power of number using recursion 
public class SumOfNrecursion {
    // TC : O(b)
    static int PowerOf(int a, int b) {
        if (b == 0)
            return 1;
        if (b == 1)
            return a;
        int ans = PowerOf(a, b - 1);
        return ans * a;
    }

    public static void main(String[] args) {
        System.out.println(PowerOf(3, 3));
    }
}