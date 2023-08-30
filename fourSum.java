import java.util.HashMap;
import java.util.Map;

public class fourSum {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i : nums1){
            for(int j : nums2){
                int sum = i + j;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
                //means that it is adding the sum as the key and the value is the count of how many times that sum has been encountered.
                // If the sum key already exists in the map, it will increment the count by 1.
                // If the sum key does not exist, it will initialize the count to 0 and then increment it by 1.
            }
        }
        for(int i : nums3){
            for(int j : nums4){
                res += map.getOrDefault(0 - i - j, 0);
            }
        }
        return res;
    }
}
