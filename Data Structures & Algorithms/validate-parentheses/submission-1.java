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
                // Stack is empty then we have a closing bracket with no opening bracket
                if (stk.isEmpty()) {
                    return false;
                }
                
                // On Top of stack , if it matches the current closing bracket
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
        // if all are matching then the stack will be finally empty as all the elements will be poped out , therefore we can use this to return "true" for our valid parantheses string .
        return stk.isEmpty();
    }
}

//More optimized Solution
// public class Solution {
//     public boolean isValid(String s) {
//         Stack<Character> stack = new Stack<>();
//         Map<Character, Character> closeToOpen = new HashMap<>();
//         closeToOpen.put(')', '(');
//         closeToOpen.put(']', '[');
//         closeToOpen.put('}', '{');

//         for (char c : s.toCharArray()) {
//             if (closeToOpen.containsKey(c)) {
//                 if (!stack.isEmpty() && stack.peek() == closeToOpen.get(c)) {
//                     stack.pop();
//                 } else {
//                     return false;
//                 }
//             } else {
//                 stack.push(c);
//             }
//         }
//         return stack.isEmpty();
//     }
// }
