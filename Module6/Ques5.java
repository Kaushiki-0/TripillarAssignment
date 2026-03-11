import java.util.*;

public class Ques5 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6}; 
        int target = 6;
        int[] result = solve(arr, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] solve(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }
}