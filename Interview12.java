// leetcode(53): Maximum Subarray - kadane's Algorithm
class Solution{
    public int maxSubArray(int[] nums){
        int currentSum=0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            currentSum+=nums[i];
            maxSum=Math.max(maxSum, currentSum);
            if(currentSum<0){
                currentSum=0;
            }
        }
        return maxSum;
    }
}
public class Interview12 {
    public static void main(String[] args){
        int[] nums= {-2,1,-3,4,-1,2,1,-5,4};
        Solution s = new Solution();
        System.out.print(s.maxSubArray(nums));
    }
}
