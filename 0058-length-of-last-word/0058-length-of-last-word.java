class Solution {
    public int lengthOfLastWord(String s) {
        // starting from the last because we need the length of the last word//
        int p = s.length() - 1;
        int length = 0;
        // Remove trailing spaces 
        while(p>=0 && s.charAt(p) ==' '){
            p--;
        }
        while(p>=0 && s.charAt(p) != ' '){
            length++;
            p--;
        }
        return length;
    }
}