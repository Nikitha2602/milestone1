package milestone1;

import java.util.Scanner;

public class Activity13 {
	public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    int diff = 23;
	    int perimeter = 206;
	    int sum = perimeter/2;
	    int l=(diff+sum)/2;
	    int b=sum-l;
	    int area=l*b;
	    System.out.print("The area of rectangle is : "+area);
	}
}