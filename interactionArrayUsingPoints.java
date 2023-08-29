import java.util.Arrays;

public class interactionArrayUsingPoints {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);//sorted array

        int length1 = nums1.length;
        int length2 = nums2.length;
        int[] intersection = new int[length1 + length2];

        int index = 0, index1 = 0, index2 = 0;

        while(index1 < length1 && index2 < length2){
            int num1 = nums1[index1], num2 = nums2[index2];
            //start from the first index of this array
            if(num1 == num2){
                if(index == 0 || num1 != intersection[index - 1]){
                    intersection[index++] = num1;
                    //make sure this number didn't happens before
                }//why index == 0?
                index1++;
                index2++;
            } else if(num1 < num2){
                index1++;
            } else {
                index2++;
            }
        }
        return Arrays.copyOfRange(intersection, 0, index);
    }
}
