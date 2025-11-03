// leetcode(55) - Jump Game
// Logic / Intuition:

// Use a variable maxIndex to track the furthest index you can currently reach.

// Traverse the array:

// If the current index i is beyond maxIndex, return false → you can’t reach here.

// Update maxIndex = max(maxIndex, i + nums[i]).

// If the loop finishes, it means you can reach (or surpass) the last index → return true.
class Solution {
    public boolean canJump(int[] nums) {
        int n =nums.length;
        int maxIndex = 0;
        for(int i=0; i<n; i++){
            if(i > maxIndex) return false;
            maxIndex = Math.max(maxIndex , i+nums[i]);
        }
        return true;
    }
}
public class Interview6 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        Solution s = new Solution();
        System.out.print(s.canJump(nums));
    }
}
