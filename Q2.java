public class Q2 {
    public static void main(String[] args) {
    int[] a={1,2,3,4,5,6};
        int[] copy={2,3,3,5,4,5};
        System.arraycopy(a,0,copy,0,a.length);
        for(int i:copy)
            System.out.println(i);
    }
}
