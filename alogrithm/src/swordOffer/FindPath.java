package swordOffer;

import java.util.Stack;

/**
 * Created by wangxin on 2018/5/21.
 */
public class FindPath {
    public void findPath(TreeNode root,int k){
        if(root == null)
            return;
        Stack<Integer> stack = new Stack<Integer>();
        int curNum=0;
        findPath(root,k,stack,curNum);
    }
    public void findPath(TreeNode node,int k,Stack stack,int curNum){
        if(node == null)
            return;
        curNum+=(int)node.element;
        stack.push(node);
        if(node.right==null&&node.left==null&&curNum==k){
            //遍历输出栈打印节点
        }else{
            findPath(node.left,k,stack,curNum);
            findPath(node.right,k,stack,curNum);
            //记得咋返回到父节点之前，在路劲上删除当前节点
            stack.pop();
        }
    }
}
