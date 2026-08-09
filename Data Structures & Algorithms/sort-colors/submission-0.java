class Solution {
    public void sortColors(int[] nums) {
        //Min Max of nums 
        int min = nums[0], max = nums[0];
        //counting sort 
        //create a hash map and the based on keys and its freqency create the sorted array 
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<nums.length; i++ ){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
            
            if (nums[i] < min){
                min = nums[i];
            }
            
            if (nums[i] > max){
                max = nums[i];
            }
        }

        int index = 0;
        for (int i = min; i <= max; i++){
            while (mp.getOrDefault(i, 0)>0){
              //copy the same element from the map
              nums[index]= i;
              index++;
              //decrement the frequncy in the map
              mp.put(i, mp.get(i)-1);
            }
        }
    }
}