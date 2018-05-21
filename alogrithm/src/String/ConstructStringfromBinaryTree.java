package String;

/**
 * Created by wangxin on 2018/5/4.
 */
public class ConstructStringfromBinaryTree {
    public String tree2str(TreeNode t) {
        if(t == null)
            return "";
        String left=tree2str(t.left);
        String right=tree2str(t.right);
        if(left.equals("")&&right.equals(""))
            return t.val+"";
        else if(right.equals(""))
            return t.val+"("+left+")";
        else
            return t.val+"("+left+")"+"("+right+")";
    }
    /*if(t == null)
            return "";
    String l = tree2str(t.left);
    String r = tree2str(t.right);
        if(l.equals("") && r.equals(""))
                return t.val + "";
        else if(r.equals(""))
                return t.val + "(" + l + ")";
        return t.val + "(" + l + ")" + "(" + r + ")";*/

}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
