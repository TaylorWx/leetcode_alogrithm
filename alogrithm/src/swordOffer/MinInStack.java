package swordOffer;

import java.util.Stack;

/**
 * Created by wangxin on 2018/5/21.
 */
public class MinInStack {
    //数据栈
    private static Stack<Integer> data_stack=new Stack<>();
    private static Stack<Integer> min_stack=new Stack<>();
    //入栈
    public static void push(int value){
        data_stack.push(value);
        if(min_stack.size()==0 ||value < min_stack.peek()){
            min_stack.push(value);
        }else{
            min_stack.push(min_stack.peek());
        }
    }
    public static void pop(){
        if(data_stack.isEmpty()){
            return;
        }
        data_stack.pop();
        min_stack.pop();
    }
    public static int min(){
        return min_stack.peek();
    }
    public static void main(String[] args) {
        push(4);
        push(6);
        push(2);
        push(5);
        pop();
        pop();
        push(1);
        System.out.print(min());
    }
}
