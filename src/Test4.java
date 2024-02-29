import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Test4 {
    public static int[] findIntersection(int[] nums1, int[] nums2){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        LinkedList<Integer> ans = new LinkedList<>();

        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])){
                ans.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int[] ans = findIntersection(new int[]{1,2,3,3,4,5}, new int[]{3,4,4,5,6,7});
        Arrays.stream(ans).forEach(x -> System.out.println("" + x)); // 3 4 5
    }
}
