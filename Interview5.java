// leetcode 169 - Majority Element
// moore's voting algorithm//
// Logic:

// When count = 0, pick new candidate.

// Increment if same, decrement if different.

// Majority element cannot be fully cancelled.
class Solution{
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate =0;
        for(int num: nums){
            if(count==0){
                candidate = num;
            }
            count+=(num==candidate)?1:-1;
        }
        return candidate;
    }
}
public class Interview5 {
        public static void main(String[] args){
        Solution s =new Solution();
        int[] nums={3,3,3,1,2,2,4,3,3};
        System.out.print(s.majorityElement(nums));
    }
}
