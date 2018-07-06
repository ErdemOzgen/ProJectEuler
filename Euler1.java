/* Problem 1
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
https://projecteuler.net/problem=1
*/
/*
 *       Filename:  Euler1.java
 *
 *    Description:  problem solution for euler projects 1
 *
 *        Created:  7/6/2018 10:46
 *       Revision:  none
 *
 *        @Author:  M.Erdem OZGEN
 *       @Version:  1.0.0
 *
 * =====================================================================================
 */

import java.util.ArrayList;


public class Euler1 {


    public static int sumOfSolitions=0;
    public static ArrayList<Integer> SubSetOfSolutions = new ArrayList<Integer>();

    public static void main(String [] args)
    {


        System.out.println(runSolution());
    }


    public static String runSolution()
    {

        for (int i=0;i<1000;i++)
        {
            if(i%3 ==0 || i%5==0)
            {
                Euler1.sumOfSolitions+=i;
                SubSetOfSolutions.add(i);
            }
        }
        return Integer.toString(sumOfSolitions);
    }

}
