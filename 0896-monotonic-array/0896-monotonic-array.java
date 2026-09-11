class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isAscending = true;
        boolean isDescending = true;
        
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] > nums[i+1]){ //not possible that array is sorted in increasing order
                isAscending = false;
            }

            if(nums[i] < nums[i+1]){
                //Not possible the array will be in descending order
                isDescending = false;
            }

            //Early exit if isAscending and isDescending will be false at the same time
            if(!isAscending && !isDescending){
                return false;
            }
        }
        //If anyone is true then return true
        return isAscending || isDescending;
    }
}