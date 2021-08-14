package milestone1;

import java.util.*;

public class Activity2 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n,max=0,count=0;
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements of array : ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			if(arr[i]>max){
				max=arr[i];count=0;
			}
			if(arr[i]==max)
				count++;
		}
		System.out.print(count);
	}
}