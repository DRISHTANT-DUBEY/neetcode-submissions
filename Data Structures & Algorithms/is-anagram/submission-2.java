class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> string_s = new HashMap<>();
        Map<Character, Integer> string_t = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {

            char charS = s.charAt(i);
            char charT = t.charAt(i);
            string_s.put(charS, string_s.getOrDefault(charS, 0) + 1);
            string_t.put(charT, string_t.getOrDefault(charT, 0) + 1);
        }
        
        return string_s.equals(string_t);
    }
}
