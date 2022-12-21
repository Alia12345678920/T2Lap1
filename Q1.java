import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(a));
        reverse(a);
        System.out.println(Arrays.toString(a));
    }

    public static void reverse(int x[]) {
        int b = x.length - 1;
        for (int i = 0; i < x.length / 2; i++) {
            int temp = x[i];
            x[i] = s[b];
            x[b] = temp;
            b--;


    }
}


}
