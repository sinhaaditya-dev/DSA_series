// Interview problem 1//
// Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

// Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

// Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
// Return k.
import java.util.ArrayList;
class Solution{
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
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
public class Interview1 {
    public static void main(String[] args){
        Solution s =new Solution();
        int[] nums = {3,2,2,3};
        int val =3;
        int size = s.removeElement(nums, val); //store the returned size//
        System.out.println(size); //print the size//

    }
}
