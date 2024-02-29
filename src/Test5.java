import java.util.Arrays;

public class Test5 {
    public static int lenOfLongSubarr(int[] array, int k) {
        Arrays.sort(array);
        int[][] DP = new int[array.length][k+1];

        // Assigning values to the array
        for (int i = 0; i < DP.length; i++) {
            for (int j = 0; j < DP[i].length; j++) {
                if (i == 0){
                    DP[i][j] = array[i] == j ? 1 : 0;
                    continue;
                }
                int s1 = DP[i-1][j];
                int s2 = 0;
                if (j - array[i] >= 0 && (DP[i-1][j - array[i]] > 0 || j - array[i] == 0)){
                    s2 = 1 + DP[i-1][j - array[i]];
                }
                DP[i][j] = Math.max(s1, s2);
            }
        }

        return DP[array.length - 1][k];
    }
    public static void main(String[] args) {
        int[] array = new int[] {6,2,2,3,4,1};
        int k = 8;
        System.out.println(lenOfLongSubarr(array, k)); // 4

        array = new int[] {6,2,3,4,1};
        k = 8;
        System.out.println(lenOfLongSubarr(array, k)); // 3

        array = new int[] {6,2,3,1};
        k = 8;
        System.out.println(lenOfLongSubarr(array, k)); // 2

        array = new int[] {6,2,3,1};
        k = 12;
        System.out.println(lenOfLongSubarr(array, k)); // 4

        array = new int[] {6,2,3,1};
        k = 13;
        System.out.println(lenOfLongSubarr(array, k)); // 0
    }
}
