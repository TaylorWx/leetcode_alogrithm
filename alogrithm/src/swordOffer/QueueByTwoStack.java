package swordOffer;

import java.util.Stack;

/**
 * Created by wangxin on 2018/5/16.
 */
public class QueueByTwoStack {
    Stack<String> stack1 =new Stack<>();
    Stack<String> stack2 =new Stack<>();
    String str="890";
    //进队列
    public void push1(String string){
        synchronized (str){
            stack1.push(string);
        }

    }
    //出队列
    public String pop1(){
        synchronized (str) {
            if(stack1.isEmpty()&&stack2.isEmpty()){
                try {
                    throw new Exception("stack is empty");
                } catch (Exception e) {
                }
            }
            if(stack2.empty()){
                while(!stack1.empty())
                    stack2.push(stack1.pop());
            }
            return stack2.pop();
        }

    }
    public static void main(String[] args) {
        QueueByTwoStack stack = new QueueByTwoStack();
        stack.push1("1");
        stack.push1("2");
        System.out.println(stack.pop1());
    }
}
