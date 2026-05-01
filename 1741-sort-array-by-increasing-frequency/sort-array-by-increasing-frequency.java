import java.util.Arrays;

class Solution {
    public int[] frequencySort(int[] nums) {
        // Step 1: Count frequencies
        // The constraints say nums[i] is between -100 and 100.
        // We use an array of size 201 to cover this range.
        // We offset by +100 so that -100 maps to index 0, and 100 maps to index 200.
        int[] freq = new int[201];
        for (int num : nums) {
            freq[num + 100]++;
        }

        // Step 2: Box primitives to Objects
        // Java's Arrays.sort() requires objects (Integer) to use a custom comparator.
        Integer[] numsObj = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsObj[i] = nums[i];
        }

        // Step 3: Sort using a custom comparator
        Arrays.sort(numsObj, (a, b) -> {
            // Retrieve the frequencies of the two elements being compared
            int freqA = freq[a + 100];
            int freqB = freq[b + 100];
            
            // Rule 1: If frequencies are identical, sort values in DECREASING order
            if (freqA == freqB) {
                return b - a; 
            }
            // Rule 2: Otherwise, sort by frequencies in INCREASING order
            return freqA - freqB;
        });

        // Step 4: Unbox back to primitive int array to return
        for (int i = 0; i < nums.length; i++) {
            nums[i] = numsObj[i];
        }

        return nums;
    }
}