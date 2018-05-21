package String;

import java.util.Stack;

/**
 * Created by wangxin on 2018/5/6.
 */
public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack=new Stack();
        char temp;
        if(s.length()==0)
            return true;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            switch(ch){
                case '{':
                    stack.add(ch);
                    break;
                case '[':
                    stack.add(ch);
                    break;
                case '(':
                    stack.add(ch);
                    break;
                case '}':
                    if(stack.size()==0) return false;
                    if(stack.pop()!='{')return false;
                    break;
                case ']':
                    if(stack.size()==0) return false;
                    if(stack.pop()!='[')return false;
                    break;
                case ')':
                    if(stack.size()==0) return false;
                    if(stack.pop()!='(')return false;
                    break;
            }
        }
        if(stack.size()==0) return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }
}
