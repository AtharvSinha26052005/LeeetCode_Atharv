class Solution {
    public int removeDuplicates(int[] nums) {

        int unique_c = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1]){
                nums[unique_c] = nums[i];
                unique_c++;
            }
        }

        return unique_c;
    }
}