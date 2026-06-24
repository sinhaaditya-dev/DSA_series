class Solution {
    public void reverse(int[] nums, int m,int n){
        int left = m;
        int right = n;
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    public void swap(int[] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n-2;
        while(i>=0 && nums[i] >= nums[i+1]){
            i--;  //breaking point
        }

        if(i>=0){
            int j= n-1;
            while(nums[j] <= nums[i]){
                j--;
            }
            swap(nums, i ,j);
        }
        reverse(nums, i+1, n-1);
    }
}