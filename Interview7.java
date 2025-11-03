/* leetcode(238)- product of array except self
// Logic / Intuition:

// We compute the product of all elements except self using:

// Prefix pass: Store product of all numbers before index i.

// Postfix pass: Multiply by product of all numbers after index i.
// 🔹 Steps:

// Initialize res[0] = 1.

// Left to Right: Fill prefix products → res[i] = res[i-1] * nums[i-1].

// Right to Left: Maintain a variable postFix = 1.
// For each i from n-1 → 0:

// Multiply res[i] *= postFix

// Update postFix *= nums[i].*/

import java.util.Arrays;

class Solution {
    public int[] productExceptSelf(int[] nums) {
      int n = nums.length;
      int[] res = new int[n];
      res[0] = 1;
      for(int i=1; i<n; i++){
        res[i] = res[i-1] * nums[i-1];
      }
      
      int PostFix = 1;
      for(int i=n-1; i>=0; i--){
        res[i] = res[i] * PostFix;
        PostFix = PostFix * nums[i];
      }
    return res;
    }
} 
public class Interview7 {
    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        Solution s = new Solution();

        System.out.println(Arrays.toString(s.productExceptSelf(nums)));
    }
}
