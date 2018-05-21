package swordOffer;


import java.util.LinkedList;

/**
 * Created by wangxin on 2018/5/18.
 */
public class MirroBinaryTree {
    //循环进行镜像
    public static void mirrorReverse(TreeNode treeNode){
        if(treeNode == null)
            return;
        if(treeNode.left==null && treeNode.right == null)
            return;
        //采用先序遍历，有子节点，则交换
        TreeNode node = treeNode.left;
        treeNode.left = treeNode.right;
        treeNode.right = node;
        mirrorReverse(treeNode.left);
        mirrorReverse(treeNode.right);

    }
    //采用非递归的形式
    public static void mirrorCur(TreeNode treeNode){
        if(treeNode == null)
            return;
        LinkedList<TreeNode> linkedList =new LinkedList<>();
        linkedList.add(treeNode);
        while(!linkedList.isEmpty()){
            TreeNode node=linkedList.poll();
            if(node.left!=null || node.right!=null){
                TreeNode temp=node.left;
                node.left = node.right;
                node.right=temp;
            }
            if(node.left!=null)
                linkedList.add(node.left);
            if(node.right!=null)
                linkedList.add(node.right);
        }
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(0);
        TreeNode lchild=new TreeNode(1);
        TreeNode rchild=new TreeNode(2);
        root.left=lchild;
        root.right=rchild;
        System.out.println(root.left.element+"\t"+root.right.element);
        mirrorCur(root);
        System.out.println(root.left.element+"\t"+root.right.element);
        mirrorReverse(root);
        System.out.println(root.left.element+"\t"+root.right.element);
    }
}
class TreeNode{
    Object element;
    TreeNode left;
    TreeNode right;
    public TreeNode(int id){
        element=(Object)id;
    }
}