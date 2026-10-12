class Solution {
public int pivotIndex(int[] nums) {
for (int i = 0; i < nums.length; i++) {
int leftSum = 0;
int rightSum = 0;


        // Calculate left sum
        for (int j = 0; j < i; j++) {
            leftSum += nums[j];
        }

        // Calculate right sum
        for (int j = i + 1; j < nums.length; j++) {
            rightSum += nums[j];
        }

        // Check pivot index
        if (leftSum == rightSum) {
            return i;
        }
    }

    return -1;
}

public static void main(String[] args) {
    Solution obj = new Solution();

    int[] nums = {1, 7, 3, 6, 5, 6};

    int result = obj.pivotIndex(nums);

    System.out.println(result);
}


}
