public class ThirdLargest {
    public static int thirdLargest(int a[]) {
        int Largest = 0;
        int SecondLarge = 0;
        int thirdLargest = -1;
        if (a.length < 3)
            return -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[Largest]) {
                thirdLargest = SecondLarge;
                SecondLarge = Largest;
                Largest = i;

            } else if (a[i] < a[Largest]) {
                if (thirdLargest == -1 || a[i] > a[SecondLarge]) {
                    thirdLargest = SecondLarge;
                    SecondLarge = i;
                } else if (a[i] < a[SecondLarge] && a[i] > a[thirdLargest]) {
                    thirdLargest = i;
                }
            }
        }
        return thirdLargest;

    }

    public static void main(String args[]) {
        int a[] = { 34, 8, 0, 5 };
        int ans = thirdLargest(a);
        System.out.println(a[ans]);
    }
}
