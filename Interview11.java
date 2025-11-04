// Leetcode(12):- Integer to Roman//
/*
 * Use arrays for values and symbols:
 * Start from largest value → smallest

While num ≥ value[i]:

Append symbol[i]

num -= value[i]
 */
class Solution{
    public String intToRoman(int num){
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<values.length; i++){
            while(num>=values[i]){
                sb.append(symbols[i]);
                num -= values[i];
            }
        }
        return sb.toString();
    }
}
public class Interview11 {
    public static void main(String[] args){
        Solution sol = new Solution();
        int num = 59;
        System.out.print(sol.intToRoman(num));
    }
}
