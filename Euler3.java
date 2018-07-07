/* Problem 3
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
https://projecteuler.net/problem=3
*/
/*
 *       Filename:  Euler3.java
 *
 *    Description:  problem solution for euler projects 3
 *
 *        Created:  7/8/2018 10:46
 *       Revision:  none
 *
 *        @Author:  M.Erdem OZGEN
 *       @Version:  1.0.0
 *
 * =====================================================================================
 */

 
 public class Euler3
 {
	 public static void main(String [] args)
	 {
		 System.out.println(new Euler3().runSolution());
	 }//endOfmain
	 
	 
	 public String runSolution()
	 {
		 long n =600851475143L;
		 
	 while(true)
	 {
		 long p = finderSmallestFactor(n);
		if(p < n)
			n /= p;
		else
			return Long.toString(n);
	 }//endOfWhile
	 
	 }//endOfrunSolution
	 
	 
	 private static long finderSmallestFactor(long n)
	 {
		 long end = (long) Math.sqrt((double) n);
		 
		 if(n <= 1)
			 throw new IllegalArgumentException();
		 
		 for (long i = 2;i <= end; i++)
		 {
			 if(n % i == 0)
				return i;
		 }//endOfFor
		 return n;
	 }//endOffinderSmallestFactor
	 
 }