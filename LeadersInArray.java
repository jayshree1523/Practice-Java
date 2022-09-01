public class LeadersInArray {
    public static void leadersElement(int a[]) {
        int Largest = -1;
        int b[] = new int[a.length];
        int j = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] > Largest) {
                Largest = a[i];
                // System.out.println(a[i] + " ");
                b[j++] = a[i];
            }
        }
        for (j = j - 1; j >= 0; j--) {
            System.out.println(b[j] + " ");
        }
    }

    public static void main(String args[]) {
        int a[] = { 9, 4, 8, 2, 4 };
        leadersElement(a);
    }
}