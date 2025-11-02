// 80. Remove Duplicates from Sorted Array II
// Use two pointers — one for reading (i), one for writing (j).
// We only keep an element if it’s not equal to the element at position j-2.
// Array is sorted ⇒ duplicates are consecutive.

// Keep at most 2 of each element.

// Compare current nums[i] with element nums[j - 2].

// If different, copy it (safe to include).

// If same, skip it (already 2 copies present).
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <=2) return nums.length;
        int j=2; 
        for(int i=2; i<nums.length; i++){
            if(nums[i] != nums[j-2]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
public class Interview4{
    public static void main(String[] args){
        Solution s =new Solution();
        int[] nums={0,0,1,1,1,1,2,3,3};
        System.out.print(s.removeDuplicates(nums));
    }

}
