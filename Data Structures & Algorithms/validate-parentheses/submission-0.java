class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        if(s.length() % 2 != 0){
            return false;
        }
        for (int i=0; i < s.length(); i++){
            char curr_char = s.charAt(i);
            if (curr_char=='{' || curr_char=='(' || curr_char=='['){
                stk.push(curr_char);
            }
            else {
                // If stack is empty, we have a closing bracket with no opening bracket
                if (stk.isEmpty()) {
                    return false;
                }
                
                // Pop the top opening bracket and see if it matches the current closing bracket
                char top = stk.pop();
                
                if (curr_char == ')' && top != '(') {
                    return false;
                }
                if (curr_char == '}' && top != '{') {
                    return false;
                }
                if (curr_char == ']' && top != '[') {
                    return false;
                }
            }
        }
        return stk.isEmpty();
    }
}
