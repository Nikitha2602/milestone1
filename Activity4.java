package milestone1;

import java.io.*;
import java.util.Scanner;
public class Activity4 {

	public static void main(String[] args) {
		int n,factorial=1;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			factorial=factorial*i;
		}
		System.out.println(factorial);

	}

}