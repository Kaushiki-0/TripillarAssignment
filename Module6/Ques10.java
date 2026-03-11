import java.util.*;

public class Ques10 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        rearrange(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void rearrange(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i = i + 2) {
            if (arr[i] % 2 != 0) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] % 2 == 0) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    }
                }
            }
        }
    }
}