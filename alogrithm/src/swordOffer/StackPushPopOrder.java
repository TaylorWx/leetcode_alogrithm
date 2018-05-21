package swordOffer;

import java.util.Stack;

/**
 * Created by wangxin on 2018/5/21.
 */
public class StackPushPopOrder {
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA.length==0 || popA.length==0){
            return false;
        }
        int popindex=0;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<pushA.length;i++){
            stack.push(pushA[i]);
            while (!stack.isEmpty() && popA[popindex] == stack.peek()){
                stack.pop();
                popindex++;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        int []num1=new int[]{1,2,3,4,5};
        int []num2=new int[]{4,5,3,2,1};
        System.out.println(IsPopOrder(num1,num2));
    }
}
