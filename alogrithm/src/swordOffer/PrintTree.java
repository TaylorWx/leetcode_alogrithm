package swordOffer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/**
 * Created by wangxin on 2018/5/21.
 */
public class PrintTree {
    public static ArrayList printTree(TreeNode root){
        Queue<TreeNode> queue=new ArrayDeque<>();
        ArrayList arrayList=new ArrayList();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node=queue.poll();
            arrayList.add(node.element);
            if(node.left!=null)
                queue.add(node.left);
            if(node.right!=null)
                queue.add(node.right);
        }
        return arrayList;

    }
    public static void main(String[] args) {
        //构造一颗二叉树
        TreeNode root=new TreeNode(0);
        TreeNode lchild=new TreeNode(1);
        TreeNode rchild=new TreeNode(2);
        TreeNode llchild=new TreeNode(3);
        TreeNode lrchild=new TreeNode(4);
        TreeNode rlchild=new TreeNode(5);
        TreeNode rrchild=new TreeNode(6);
        root.left=lchild;
        root.right=rchild;
        lchild.left=llchild;
        lchild.right=lrchild;
        rchild.left=rlchild;
        rchild.right=rrchild;
        ArrayList arrayList=printTree(root);
        System.out.println(arrayList.toString());
    }

}
/*
class TreeNode{
    Object element;
    TreeNode left;
    TreeNode right;
    public TreeNode(int id){
        element=(Object)id;
    }
}*/
