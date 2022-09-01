//TC : theta(n)

public class SecondLarge {
    public static int find(int a[]) {
        int Largest = 0;
        int SecLargest = -1;
        if (a.length < 2)
            return -1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[Largest]) {
                SecLargest = Largest;
                Largest = i;

            } else if (a[i] < a[Largest]) {
                if (SecLargest == -1 || a[i] > a[SecLargest])
                    SecLargest = i;
            }
        }
        return SecLargest;
    }

    public static void main(String[] args) {

        int a[] = { 2, 1, 4, 5, 3 };
        int ans = find(a);
        System.out.println(a[ans]);
    }
}
