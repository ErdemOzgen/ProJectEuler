/* Problem 2
Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
https://projecteuler.net/problem=2
*/
/*
 *       Filename:  Euler2.java
 *
 *    Description:  problem solution for euler projects 2
 *
 *        Created:  7/8/2018 10:46
 *       Revision:  none
 *
 *        @Author:  M.Erdem OZGEN
 *       @Version:  1.0.0
 *
 * =====================================================================================
 */


public class Euler2
{
	public static void main(String [] args)
	{
		System.out.println(new Euler2().runSolution());
	}
	
	public static String runSolution()
	{
		int sum = 0;
		int x = 1;
		int y = 2;
		int z = 0;
		
		while(x <= 4000000)
		{
			if(x % 2 == 0)
				sum +=x;
			z= x + y;
			x=y;
			y=z;
			
		}//endOfWhile
		
		return Integer.toString(sum);
	}
}