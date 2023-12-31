import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);//sort the array

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return result;//which is empty
            }

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;//why nums[i] == nums[i - 1]就去重了呢
            }//i > 0 is because i will - 1 later, so i should at least > 0

            int left = i + 1;
            int right = nums.length - 1;

            while (right > left) {//why not =
                //since the array is sorted, this would not give us a valid triplet that sums to zero.
                //then how about -2, 1, 1?
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {//=
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (right > left && nums[right] == nums[right - 1]) {
                        right--;//why right > left is necessary
                    }//prevent accessing elements outside the array bounds
                    while (right > left && nums[left] == nums[left + 1]) {
                        left++;//i understand but still need to think about the -1/+1's meaning and why
                    }
                    right--;
                    left++;
                }
            }
        }
        return result;
    }
}
