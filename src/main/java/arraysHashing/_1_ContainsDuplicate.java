package arraysHashing;

import java.util.HashSet;

public class _1_ContainsDuplicate {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> intMap = new HashSet<>();
        if (nums.length <= 1) return false;
        for (Integer i : nums) {
            if (intMap.contains(i)) {
                return true;
            }
            intMap.add(i);
        }
        return false;
    }


}
