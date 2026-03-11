import java.util.*;
public class Ques2 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6};
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        System.out.println(Arrays.toString(prefix));
    }

    public int getRangeSum(int[] prefix, int L, int R) {
        if (L == 0) return prefix[R];
        return prefix[R] - prefix[L - 1];
    }
}