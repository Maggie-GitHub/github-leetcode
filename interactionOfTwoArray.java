import java.util.HashSet;
import java.util.Set;

public class interactionOfTwoArray {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0){
            return new int[0];
        }
        Set<Integer> set = new HashSet<>();
        Set<Integer> reset = new HashSet<>();

        for(int i : nums1){
            set.add(i);
        }
        for(int i : nums2){
            if(set.contains(i)){
                reset.add(i);
            }
        }

        int[] array = new int[reset.size()];
        int j = 0;
        for(int i : reset){
            array[j] = i;
            j++;
        }
        return array;
    }
}
