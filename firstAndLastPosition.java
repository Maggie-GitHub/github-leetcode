public class firstAndLastPosition {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0){
            return new int[] {-1, -1};
        }

        int left = 0, right = nums.length - 1;

        while(left < right){//还是不懂为什么这样分大于等于target
            int mid = left + (right - left) / 2;
            if(nums[mid] >= target){
                right = mid;
            } else{
                left = mid + 1;
            }
        }
        if(nums[right] != target){
            return new int[] {-1, -1};
        }

        int Left = right;//从第一个binary search出来的条件就说left = right 所以这里等于哪个都一样
        //这个命名有歧义 应该用firstPoint
        left = 0; right = nums.length - 1;

        while(left < right){
            int mid = (left + right + 1)/2;
            if(nums[mid] <= target){
                left = mid;
            } else{
                right = mid - 1;
            }
        }
        return new int[] {Left, right};
    }
}
