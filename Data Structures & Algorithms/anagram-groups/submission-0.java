class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> sHashMap = new HashMap<>();
        for(String iStrs : strs){
            char[] Str = iStrs.toCharArray();
            Arrays.sort(Str);
            String signature = new String(Str);

            if(!sHashMap.containsKey(signature)){
                sHashMap.put(signature, new ArrayList<>());
            } 

            sHashMap.get(signature).add(iStrs);
        }

        return new ArrayList<>(sHashMap.values());
    }
}
