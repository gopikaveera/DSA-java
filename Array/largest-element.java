import java.util.* ;
import java.io.*; 

public class Solution {

    static int largestElement(int[] arr, int n) {
        int largestElement=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>largestElement){
                largestElement=arr[i];
            }
        }
        return largestElement;

    }
}
//TimeComplexity O(n)
