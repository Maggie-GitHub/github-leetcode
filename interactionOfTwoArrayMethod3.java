import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class interactionOfTwoArrayMethod3 {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] hash1 = new int[1002];
        int[] hash2 = new int[1003];
        //the question says the max length is 1000

        Arrays.fill(hash1, 1);
        Arrays.fill(hash2, 1);
        //find the nums1 and nums2

        List<Integer> reList = new ArrayList<>();
        for(int i = 0; i < 1002; i++){
            if(hash1[i] > 0 && hash2[i] > 0){
                reList.add(i);//how do they know if the number is 1
            }
        }
        int index = 0;
        int res[] = new int[reList.size()];//new array to collect the result
        for(int i : reList){
            res[index] = i;
            index++;
        }//maybe just remeber this way to solve the problem
        return res;
    }
}
