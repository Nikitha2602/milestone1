package milestone1;

import java.io.*;
import java.lang.Math;
import java.util.Scanner;

	    
public class Activity14 {
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      int x=43,y=91,z=183;
    
      int a=Math.abs(x-y);
      int b=Math.abs(z-y);
      int c=Math.abs(z-x);
      int gcdNumbers = Activity14.findGCD(a,b,c);
      System.out.println(gcdNumbers);
      sc.close();
   }
   public static int findGCD(int x, int y) 
   {
      if(y == 0)
      {
         return x;
      }
      else
      {
         return findGCD(y, x % y);
      }
   }
   public static int findGCD(int x, int y, int z) 
   {
      return findGCD(findGCD(x, y), z);
   }
}