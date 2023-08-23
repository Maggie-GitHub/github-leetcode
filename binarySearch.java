public class binarySearch {
    public int search(int[] nums, int target) {
        if(target < nums[0] || target > nums[nums.length - 1]){
            return -1;
        }

        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(target < nums[mid]){
                right = mid - 1;
            } else if(target > nums[mid]){
                left = mid + 1;
            } else if(target == nums[mid]){
                return mid;
            }
        }
        return -1;
    }
}
