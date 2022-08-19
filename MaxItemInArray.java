package DSA;

import java.util.Scanner;


class Max{
	
	public void max(int []arr){
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
		if(max<arr[i]) {
			max=arr[i];
		}
	
		}
		System.out.println(max);
	}
}
public class MaxItemInArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int [] array=new int[5];
		System.out.println("Enter the item in Array...");
		for(int i=0;i<array.length;i++) {
		array[i]=s.nextInt();
		System.out.print(array[i]+" ");
		}
		System.out.println();
		Max obj=new Max();
		obj.max(array);
	}

}
