import java.util.*;

public class Ques3 {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 0};
        
        int L = 1, R = 3, val = 5;
        
        arr[L] += val;
        if (R + 1 < arr.length) {
            arr[R + 1] -= val;
        }

        getArr(arr);
    }

    public static void getArr(int[] diff) {
        for (int i = 1; i < diff.length; i++) {
            diff[i] += diff[i - 1];
        }
        System.out.println(Arrays.toString(diff));
    }
}