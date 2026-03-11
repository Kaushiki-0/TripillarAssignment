public class Ques8 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println(longestSub(arr, k));
    }

    public static int longestSub(int[] arr, int k) {
        int maxLen = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum += arr[j];

                if (currentSum == k) {
                    int currentLen = j - i + 1;
                    if (currentLen > maxLen) {
                        maxLen = currentLen;
                    }
                }
            }
        }
        return maxLen;
    }
}