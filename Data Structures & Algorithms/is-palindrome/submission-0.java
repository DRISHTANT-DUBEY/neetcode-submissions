class Solution {
    public boolean isPalindrome(String s) {
        char[] sArray = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();
        int n = sArray.length;
        for(int i=0; i<n/2; i++){
            if(sArray[i]!=sArray[n-i-1]){
                return false;
            }
        }
        return true;
    }
}
