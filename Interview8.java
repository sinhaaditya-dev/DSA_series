// leetcode(151) - Reverse words in a string//
class Solution {
    public String reverseWords(String s) {
       String[] words = s.split(" ");
       StringBuilder reversed = new StringBuilder();
       for(int i = words.length-1; i>=0; i--){
        reversed.append(words[i]);
        if(i!=0){
            reversed.append(" ");
        }
       } 
       return reversed.toString();
    }
}
public class Interview8{
    public static void main(String[] args) {
        Solution s = new Solution();
        String str = "  Hello world from java  ";
        System.out.print(s.reverseWords(str));
    }

}
