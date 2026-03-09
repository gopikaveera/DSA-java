// single pass tracking
import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findSecondLargest(int n, int[] arr) {
		int largest=arr[0];
		int slargest=Integer.MIN_VALUE; //minimum integer value
		for(int i=0;i<n;i++){
			if(arr[i]>largest){
				slargest=largest;
				largest=arr[i];

			}
			else if(arr[i]<largest && arr[i]>slargest){ // element less than largest & greater than second largest
				slargest=arr[i];
			}
		}
		if (slargest == Integer.MIN_VALUE) // In case 2nd largest doesnot exist return -1
			return -1;
		return slargest;
	}
}
// Time Complexity O(n)
