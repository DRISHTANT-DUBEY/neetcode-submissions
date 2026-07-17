
class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> uniquenumbers = new HashMap<>();

        for(int i=0; i<nums.length;i++ ){
            Integer numCount = uniquenumbers.get(nums[i]);
            if (numCount != null){
                return true;
            }
            uniquenumbers.put(nums[i], 1);
            
        }
        return false;
    }
}