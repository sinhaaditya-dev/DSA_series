class Solution{
    public int partition(int[] arr, int low , int high){
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<=pivot && i<=high-1){ //left side//
                i++;
            }
            while(arr[j]>pivot && j>=low+1){ //right side//
                j--;
            }
            if(i<j){
                //swap arr[i] and arr[j]//
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            int temp = arr[low];
            arr[low]=arr[j];
            arr[j]=temp;
        }
        return j; //pivot index//
    }
    public int quickSort(int[] arr, int low, int high){
        if(low<high){
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot-1); //left side//
            quickSort(arr, pivot+1, high); //right side//
        }
        return high ;

    }
}
public class QuickSort{
    public static void main(String[] args){
        int[] arr = {34, 7, 23, 32, 5, 62};
        Solution sol = new Solution();
        int sorted=sol.quickSort(arr, 0, arr.length-1);
        System.out.print("Sorted array: ");
        for(int i=0; i<=sorted; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
