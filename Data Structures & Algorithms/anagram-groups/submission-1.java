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
// this time we use  sort if there are many other characters
//Way shorter solution 
        // Map<String, List<String>> map = new HashMap<>();

        // for (String s : strs) {
        //     char[] arr = s.toCharArray();
        //     Arrays.sort(arr);
        //     String key = new String(arr);
        //     List<String> value = map.getOrDefault(key, new ArrayList<>());
        //     value.add(s);
        //     map.put(key, value);
        // }
        // List<List<String>> res = new ArrayList<>(map.values());

        // return res;