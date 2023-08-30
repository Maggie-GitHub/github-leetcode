import java.util.HashSet;
import java.util.Set;
//基本思路：列出nums1里的数（非重复），再拿nums2里的数去比较 哪些是出现过的
public class interactionOfTwoArray {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0){
            return new int[0];
        }//if all those above happens, return 0
        Set<Integer> set = new HashSet<>();
        Set<Integer> reset = new HashSet<>();

        for(int i : nums1){//fine the nums from nums1
            set.add(i);
        }
        for(int i : nums2){//find the nums1's num happens in nums2
            if(set.contains(i)){
                reset.add(i);
            }
        }

        int[] array = new int[reset.size()];//create a new array to collect those nums
        int j = 0;
        for(int i : reset){
            array[j] = i;
            j++;
        }
        return array;
    }
}
