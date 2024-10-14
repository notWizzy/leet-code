import java.util.List;

public class LeetCode {
    public static void main(String[] args) {
        System.exit(0);
    }

    // 1. Two Sum
    // Input: nums = [2,7,11,15], target = 9 => Output: [0,1]
    public static int[] twoSum(int[] nums, int target) {
        int arr[] = { 0, 0 };
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] + nums[j] == target) {
                        arr[0] = i;
                        arr[1] = j;
                    }
                }
            }
        }
        return arr;
    }

    // 136. Single Number
    // Input: nums = [4,1,2,1,2] => Output: 4
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            // Bitwise XOR Operation
            result ^= nums[i];
        }
        return result;
    }

    // 2235. Add Two Integers
    // Input: num1 = 12, num2 = 5 => Output: 17
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    // 1470. Shuffle the Array
    // Input: nums = [1,1,2,2], n = 2 => Output: [1,2,1,2]
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];

        for (int i = 0; i < n; i++) {
            // Placing the first half of the elements at even indices
            result[2 * i] = nums[i];
            // Placing the second half of the elements at odd indices
            result[2 * i + 1] = nums[i + n];
        }
        return result;
    }

    // 2413. Smallest Even Multiple, Smallest multiple of n and 2
    // Input: n = 5 => Output: 10; Input: n = 6 => Output: 6
    public static int smallestEvenMultiple(int n) {
        if (n % 2 == 0) {
            return n;
        }
        return n * 2;
    }

    // 2469. Convert the Temperature
    // You should convert Celsius into Kelvin and Fahrenheit and return it as an
    // array ans = [kelvin, fahrenheit]
    // Input: celsius = 36.50 => Output: [309.65000,97.70000]
    public static double[] convertTemperature(double celsius) {
        // Return the converted temperature in a double array
        return new double[] { celsius + +273.15, celsius * 1.80 + 32.00 };
    }

    // 2798. Number of Employees Who Met the Target
    // Input: hours = [0,1,2,3,4], target = 2 => Output: 3
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int counter = 0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target) counter++;
        }
        return counter;
    }

    // 2824. Count Pairs Whose Sum is Less than Target
    // Input: nums = [-1,1,2,3,1], target = 2 => Output: 3
    public static int countPairs(List<Integer> nums, int target) {
        int counter = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.size(); j++) {
                if (i != j) {
                    if (nums.get(i) + nums.get(j) < target) counter++;
                }
            }
        }
        // Counts all the pair combinations, so divide by 2 to get the unique count
        return counter / 2;
    }
}




