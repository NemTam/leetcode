package easy;


// 35 Search Insert Position
public class SearchIndexPosition {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= target) {
                return i;
            }
        }
        return nums.length - 1;
    }
}
