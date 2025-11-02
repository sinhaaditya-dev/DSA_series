// Count subsequences whose sum is k and return only the no. of such subsequences//
class Solution{
    public int printS(int ind, int s, int sum , int[] arr, int n){
        //base case//
        if(ind==n){
            if(s==sum){
                return 1;
            }
            else{
                return 0;
            }
        }
        //include//
        s+=arr[ind];
        int l = printS(ind+1, s, sum, arr, n);
        //exclude//
        s-=arr[ind];
        int r = printS(ind+1, s, sum, arr, n);
        return l+r;

    }
}
public class Interview3 {
   public static void main(String[] args){
         int[] arr = {1,2,1};
         int k =2;
         int n =arr.length;
         int ind = 0;
         int s=0;
         Solution sol = new Solution();
         System.out.println(sol.printS(ind, s, k, arr, n)); 

    } 
}
