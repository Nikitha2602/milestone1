package milestone1;

import java.io.*;
import java.util.Scanner;
public class Activity1 {
public static void main(String[] args) {
int i,n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int Array[];   
Array = new int[n];
		for(i=0;i<n;i++)
		{
		Array[i]=sc.nextInt();	
		}
   int max = Array[0];
        for (i = 1; i < n; i++){
            if (Array[i] > max)
                max = Array[i];
       
	}
System.out.println(max);
}
}