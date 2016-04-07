/**
 * 
 */
package dynamicprogramming;

import java.util.Arrays;

/**
 * @author adrianafuentes
 *
 */
public class DynamicProgrammingDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Problem 1 - Longest Increasing Subsequence
		LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
		
		System.out.println("---------------------------------------");
		int[] val = new int[]{3,4,-1,0,6,2,4};
		int[] res = new int[val.length];
		System.out.println("Val Array: " + Arrays.toString(val));
		int max = lis.findLongestIncreasingSubsequence(val, val.length, res);
		System.out.println("Test#1 - Longest Increasing Subsequence is x: " + max);
		
		
		int[] val2 = new int[]{5,-1,3,2,6,7,9,10,11};
		int[] res2 = new int[val2.length];
		System.out.println("\nVal Array: " + Arrays.toString(val));
		int max2 = lis.findLongestIncreasingSubsequence(val2, val2.length, res2);	
		System.out.println("Test#2 - Longest Increasing Subsequence is x: " + max2);
		
		System.out.println("---------------------------------------");
		// Problem 2 - Longest Common Subsequence
		LongestCommonSubsequence lcs = new LongestCommonSubsequence();
		char[] Seq1 = new char[]{'a','b','c','d','a','f'};
		char[] Seq2 = new char[]{'a','c','b','c','f'};
		
		System.out.println("\nVal Seq1: " + Arrays.toString(Seq1));
		System.out.println("Val Seq2: " + Arrays.toString(Seq2));
		int lcs_max = lcs.findLongestCommonSubsequence(Seq1, Seq2);
		System.out.println("LongestCommonSubsequence " + lcs_max);
		
		// Problem 3 - Minimum Edit Distance
		System.out.println("---------------------------------------");
		MinimumEditDistance med = new MinimumEditDistance();
		String str1 = "cat";
		String str2 = "cats";
		int med_min1 = med.findMinimumEditDistance(str1, str2);
		System.out.println("\nMinimum Edit Distance = " + med_min1);
		
		String str3 = "abcdef";
		String str4 = "azced";
		int med_min2 = med.findMinimumEditDistance(str3, str4);
		System.out.println("\nMinimum Edit Distance = " + med_min2);
	}

}
