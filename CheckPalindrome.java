
public class CheckPalindrome {
    static int Palindrome(int a[], int s, int e) {

        if (s >= e)
            return 1;
        if (a[s] == a[e]) {
            return Palindrome(a, s + 1, e - 1);
        } else
            return 0;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 0, 2, 1 };
        int n = a.length;
        if (Palindrome(a, 0, n - 1) == 1) {
            System.out.println("palindrome");
        } else {
            System.out.println("Not palindrome");
        }

    }
}
