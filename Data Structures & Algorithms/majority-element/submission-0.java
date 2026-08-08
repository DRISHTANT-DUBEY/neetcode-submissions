class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<nums.length; i++ ){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }
        //geting maximum entry 
        Map.Entry<Integer, Integer> maxEntry = null;

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }

        int maxKey = (maxEntry != null) ? maxEntry.getKey() : null;

        // int maxKey = mp.entrySet().stream()
        // .max(Map.Entry.comparingByValue())
        // .map(Map.Entry::getKey)
        // .orElse(null); // Returns null if the map is empty

        return maxKey;

    }
}