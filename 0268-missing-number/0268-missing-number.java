class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        for (int i = 0; i <= n; i++) {
            
           int j;

            for ( j = 0; j < n; j++) {
                if (nums[j] == i) {
                    break;
                }
            }

            if (j == n) {
                return i;
            }
        }

        return -1;
    }
}