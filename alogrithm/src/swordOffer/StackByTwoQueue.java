package swordOffer;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by wangxin on 2018/5/16.
 */
public class StackByTwoQueue {
    Queue<String> queue1 =new LinkedBlockingQueue<>();
    Queue<String> queue2 =new LinkedBlockingQueue<>();
    /*
    * 两个队列实现一个栈
    * pop完成出栈操作，push完成入栈操作
    */
    public void push(String obj) {
        if(queue1.isEmpty()){
            queue2.add(obj);
        }
        if(queue2.isEmpty()){
            queue1.add(obj);
        }
    }
    public String pop(){
        //两个栈都为空时，没有元素可以弹出
        if (queue1.isEmpty()&&queue2.isEmpty()) {
            try {
                throw new Exception("stack is empty");
            } catch (Exception e) {
            }
        }
        if(queue1.isEmpty()){
            //在queue2中
            while(queue2.size()>1){
                queue1.add(queue2.poll());
            }
            return queue2.poll();
        }
        if(queue2.isEmpty()){
            while(queue1.size()>1){
                queue2.add(queue1.poll());
            }
            return queue1.poll();
        }
        return null;
    }
    public static void main(String[] args) {
        StackByTwoQueue stack = new StackByTwoQueue();
        for(int i=0;i<9;i++){
            stack.push(i+"");
        }
        System.out.println(stack.pop());
        stack.push("gggggggggg");
        System.out.println(stack.pop());
        for(int i=0;i<20;i++){
            System.out.println(stack.pop());
        }
    }
}
