package milestone1;

import java.util.*;

public class Activity7 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int speed, time,length;
		System.out.print("Enter the train speed in km/hr : ");
		speed=sc.nextInt();
		System.out.print("\nEnter the time in seconds : ");
		time=sc.nextInt();
		length = (speed * 1000 * time)/3600;
		System.out.print("The length of train is : "+length+"m");
	}
}