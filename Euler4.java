/* Problem 4
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
https://projecteuler.net/problem=4
*/
/*
 *       Filename:  Euler4.java
 *
 *    Description:  problem solution for euler projects 4
 *
 *        Created:  7/8/2018 10:46
 *       Revision:  none
 *
 *        @Author:  M.Erdem OZGEN
 *       @Version:  1.0.0
 *
 * =====================================================================================
 */


public class Euler4 {

    public static  void main(String [] args)
    {

        System.out.println(new Euler4().runSolution());
    }

    public static String runSolution()
    {
        int maxPalindromeNum = -1;
        for (int i =100 ; i < 1000; i++)
        {
            for(int j = 100; j <1000;j++)
            {
                int prod = i*j;
                if(isPalindrome(String.valueOf(prod)) && prod > maxPalindromeNum)
                    maxPalindromeNum = prod;
            }
        }
        return Integer.toString(maxPalindromeNum);
    }

    private static boolean isPalindrome(String PalindromeCandidate)
    {
        if(PalindromeCandidate.length() < 2)
            return true;
        if(PalindromeCandidate.charAt(0) != PalindromeCandidate.charAt(PalindromeCandidate.length()-1))
            return false;
        return isPalindrome(PalindromeCandidate.substring(1, PalindromeCandidate.length() - 1));
    }

}
