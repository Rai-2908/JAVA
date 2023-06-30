/*
 * Problem 1: Maximum Subarray Sum
Given an array of integers, find the contiguous subarray with the largest sum. Write a Java program that takes an array as input and outputs the maximum subarray sum.

Sample Input:
Array: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Sample Output:
Maximum Subarray Sum: 6 (corresponding to the subarray [4, -1, 2, 1])

 */
/*import java.util.Scanner;

public class ds2 {
    public static int maxSubarraySum(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] nums = new int[size];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        int maxSum = maxSubarraySum(nums);

        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}

*/

/*
 * Problem 2: Longest Increasing Subsequence
Given an array of integers, find the length of the longest increasing subsequence. Write a Java program that takes an array as input and outputs the length of the longest increasing subsequence.

Sample Input:
Array: [10, 22, 9, 33, 21, 50, 41, 60]


Sample Output:
Length of Longest Increasing Subsequence: 5 (corresponding to the subsequence [10, 22, 33, 50, 60])

 */
import java.util.Scanner;

public class ds2 {
    public static int longestIncreasingSubsequence(int[] nums) {
        int[] dp = new int[nums.length];

        // Initialize all elements of dp array to 1
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
        }

        // Compute the length of longest increasing subsequence
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        // Find the maximum length in the dp array
        int maxLength = 0;
        for (int i = 0; i < nums.length; i++) {
            maxLength = Math.max(maxLength, dp[i]);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] nums = new int[size];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        int maxLength = longestIncreasingSubsequence(nums);

        System.out.println("Length of Longest Increasing Subsequence: " + maxLength);
    }
}

