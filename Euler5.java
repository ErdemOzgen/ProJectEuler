/* Problem 5
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
https://projecteuler.net/problem=5
*/
/*
 *       Filename:  Euler5.java
 *
 *    Description:  problem solution for euler projects 5
 *
 *        Created:  7/8/2018 16.10
 *       Revision:  none
 *
 *        @Author:  M.Erdem OZGEN
 *       @Version:  1.0.0
 *
 * =====================================================================================
 */

import java.math.BigInteger;
import java.util.ArrayList;

public class Euler5 {


    public static void main(String [] args)
    {
        System.out.println(new Euler4().runSolution());
    }


    public static String runSolution()
    {
        BigInteger allOfLcm = BigInteger.ONE;

        for(int i = 1; i<=20;i++)
            allOfLcm =lcm(BigInteger.valueOf(i), allOfLcm);

        return allOfLcm.toString();
    }

    private static BigInteger lcm(BigInteger x, BigInteger y) {
        return x.divide(x.gcd(y)).multiply(y);
    }

}
