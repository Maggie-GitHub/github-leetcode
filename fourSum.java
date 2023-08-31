import java.util.HashMap;
import java.util.Map;
public class fourSum  {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {4, 5, 9};
        int[] nums3 = {1, 2, -3};
        int[] nums4 = {2, -2, -3};
        int res = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i : nums1){
            for(int j : nums2){
                int sum = i + j;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
                //means that it is adding the sum as the key and the value is the count of how many times that sum has been encountered.
                // If the sum key already exists in the map, it will increment the count by 1.
                // If the sum key does not exist, it will initialize the count to 0 and then increment it by 1.
                System.out.println("Sum: " + sum + ", Count: " + map.get(sum));
                //by those above numbers i inputed into the nums1 and nums2,
                //the result is
                //Sum: 5, Count: 1
                //Sum: 6, Count: 1
                //Sum: 10, Count: 1
                //Sum: 6, Count: 2
                //Sum: 7, Count: 1
                //Sum: 11, Count: 1
                //Sum: 7, Count: 2
                //Sum: 8, Count: 1
                //Sum: 12, Count: 1
                //sum is nums1's element + nums2' element
                //count is how many times that sum happen
            }
        }
        for(int i : nums3){
            for(int j : nums4){
                res += map.getOrDefault(0 - i - j, 0);
            }
        }
        System.out.println("Final Result: " + res);
        //Final Result: 3
        //-5 once, -6 twice, so final result = 3
    }
}
