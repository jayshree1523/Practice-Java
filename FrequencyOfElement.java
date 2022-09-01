public class FrequencyOfElement {
    static void Frequency(int a[]) {
        int i, j, flag = -1;
        int b[] = new int[a.length];
        for (i = 0; i < a.length; i++) {
            int count = 1;
            for (j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                    b[j] = flag;
                }
            }
            if (b[i] != flag)
                b[i] = count;

        }
        for (i = 0; i < b.length; i++) {
            if (b[i] != flag)
                System.out.println(a[i] + "freq : " + b[i] + " ");
        }
    }

    public static void main(String args[]) {
        int a[] = { 1, 1, 3, 3, 3, 5, 5 };
        Frequency(a);
    }

}
