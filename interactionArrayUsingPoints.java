import java.util.Arrays;

public class interactionArrayUsingPoints {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);//sorted array

        int length1 = nums1.length;
        int length2 = nums2.length;
        int[] intersection = new int[length1 + length2];
        //i don't know length1 and length2, which one is longer, so + them both

        int target = 0;//why
        int left = 0, right = 0;//left and right point for the two nums

        while(left < length1 && right < length2){//comes to the end, stop
            int num1 = nums1[left], num2 = nums2[right];
            //start from the first index of this array
            if(num1 == num2){
                if(target == 0 || num1 != intersection[target - 1]){
                    intersection[target] = num1;
                    target ++;//collect the target number
                    //make sure this number didn't happen before
                }//why target == 0?
                left++;
                right++;
            } else if(num1 < num2){
                left++;
            } else {
                right++;
            }
        }
        return Arrays.copyOfRange(intersection, 0, target);
    }
}
