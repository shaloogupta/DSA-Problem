package DSA;

import java.util.Arrays;

class Reverse{
public void swap(int arr[], int start,int end){
	int temp=arr[start];
	arr[start]=arr[end];
	arr[end]=temp;
	
	
}
public void rev(int[]arr) {
	int start=0;
	int end=arr.length-1;
	while(start<end) {
		swap(arr,start,end);
		start++;
		end--;
	}
	
}
}



public class ReverseArrayUsingSwap {

	public static void main(String[] args) {
		int [] arr= {4,8,6,9,12,10};
		Reverse obj=new Reverse();
		obj.rev(arr);
		System.out.println(Arrays.toString(arr));

	}

}
