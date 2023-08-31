import java.util.Arrays;

public class interactionArrayUsingPoints {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);//sorted array

        int length1 = nums1.length;
        int length2 = nums2.length;
        int[] intersection = new int[length1 + length2];
        //i don't know length1 and length2, which one is longer, so + them both

        int index = 0;//count the length of the result array
        int left = 0, right = 0;//left and right point for the two nums

        while(left < length1 && right < length2){//comes to the end, stop
            int num1 = nums1[left], num2 = nums2[right];
            //start from the first index of this array
            if(num1 == num2){
                if(index == 0 || num1 != intersection[index - 1]){
                    intersection[index] = num1;
                    index++;//collect the target number
                    //make sure this number didn't happen before
                }//why target == 0?
                //because if the index == 0, means that's the first intersection, so no repeat and can't - 1
                left++;
                right++;
            } else if(num1 < num2){
                left++;
            } else {
                right++;
            }
        }
        return Arrays.copyOfRange(intersection, 0, index);
    }
    //1,3,3,4
    //2,3,3,4
}
