public class SearchEle {
    public static void main(String[] args) {
        // System.out.println("Searching element");
        int a[] = { 2, 1, 4, 6, 5 };
        int key = 6;
        int res = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                res = i;
                break;
            }
        }
        if (res == -1)
            System.out.println("Not found");
        else
            System.out.println(res);

    }
}
