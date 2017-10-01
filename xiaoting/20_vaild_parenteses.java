//Source: https://github.com/tg123/leetcode/tree/gh-pages/valid-parentheses
/**Using a stack to store the brackets, when a new bracket comes, test if the new one and the one on the stack's top are pairing.

Remove the top one on the stack if they are pairing, or push the new one into stack inorder to wait further pairing.

After all brackets are processed, there should be an empty stack if all brackets are paired

*/
class Solution {
    public  boolean isValid(String s) {
        if(s == null) return false;
        
        char[] chars = s.toCharArray();
        
        if(chars.length == 0 || chars.length % 2 == 1) return false;
        
        LinkedList<Character> stack = new LinkedList<Character>();
        
        for(char c: chars){
            Character peek = stack.peek(); //retrieve the head of the list

            if(couple(peek, c)){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        
        return stack.size() == 0;
    }
    boolean couple(Character l, Character r){
        if(l == null) return false;
        return (l == '[' && r == ']') || (l == '(' && r == ')') || (l == '{' && r == '}');
    }
}