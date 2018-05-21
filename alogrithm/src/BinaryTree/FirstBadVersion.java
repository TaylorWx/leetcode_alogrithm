package BinaryTree;

/**
 * Created by wangxin on 2018/5/3.
 */
public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int start = 1, end = n;
        while (start < end) {
            int mid = start + (end-start) / 2;
            if (!isBadVersion(mid)) start = mid + 1;
            else end = mid;
        }
        return start;
    }
    public boolean isBadVersion(int version){
        return true;
    }

    public static void main(String[] args) {

    }
}
