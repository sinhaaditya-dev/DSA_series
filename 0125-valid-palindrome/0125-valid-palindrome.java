class Solution {
    public boolean isPalindrome(String s) {
       int left = 0;
       int right= s.length()-1;
       while(left< right){
        //Trap 1: if character at left is not a number or letter skip 
        while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
            left++;
        } 
        //trap 2- if the char at right is not a letter or digit, skip it
        while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
            right--;
        } 

        char leftChar = Character.toLowerCase(s.charAt(left));
        char rightChar = Character.toLowerCase(s.charAt(right));
        if(leftChar != rightChar){
            return false;
        }
        left++;
        right--;
       }
       return true;
    }
}