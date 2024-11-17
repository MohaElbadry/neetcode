package arraysHashing;

public class _3_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] res = {-1, -1};
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
