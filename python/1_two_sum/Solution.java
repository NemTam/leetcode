import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> store = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (store.containsKey(nums[i])) {
                return new int[]{store.get(nums[i]), i};
            } else {
                store.put(target-nums[i], i);
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};
        int[] res = twoSum(ints, 5);
        System.out.println(Arrays.toString(res));
    }
}