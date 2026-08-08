class Solution {
    public int removeElement(int[] nums, int val) {
        int valid_size=0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != val){
                nums[valid_size] = nums[i];
                valid_size++;
            }
        }
        return valid_size; 
    }
}