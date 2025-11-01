//Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.

// Consider the number of unique elements in nums to be k​​​​​​​​​​​​​​. After removing duplicates, return the number of unique elements k.

// The first k elements of nums should contain the unique numbers in sorted order. The remaining elements beyond index k - 1 can be ignored.
import java.util.ArrayList;
class Solution{
    public int removeDuplicates(int[] nums){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        //copying elements from list to nums array//
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        return list.size(); //returning the size of the new array//

    }
}
public class Interview2 {
    public static void main(String[] args){
        Solution s = new Solution();
        int[] nums={1,2,1};
        int ans = s.removeDuplicates(nums);
        System.out.println("Output: "+ans);
        }
}
