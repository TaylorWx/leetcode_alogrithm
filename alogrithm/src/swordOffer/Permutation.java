package swordOffer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by wangxin on 2018/5/21.
 */
public class Permutation {
    public static ArrayList<String> permutation(String str){
        if (str == null)
            return null;
        ArrayList<String> list = new ArrayList<String>();
        char[] pStr = str.toCharArray();
        permutation(pStr, 0, list);
        //去重？
        Collections.sort(list);
        return list;
    }
    public static void permutation(char[] str, int i, ArrayList<String> list) {
        // 如果为空
        if (str == null)
            return;
        // 如果i指向了最后一个字符
        if (i == str.length - 1) {
            if (list.contains(String.valueOf(str)))
                return;
            list.add(String.valueOf(str));
        } else {
            // i指向当前我们做排列操作的字符串的第一个字符
            for (int j = i; j < str.length; j++)
            {
                // 把做排列操作的字符串的第一个字符和后面的所有字符交换
                char temp = str[j];
                str[j] = str[i];
                str[i] = temp;
                // 交换后对i后面的字符串递归做排列操作
                permutation(str, i + 1, list);
                // 每一轮结束后换回来进行下一轮排列操作
                temp = str[j];
                str[j] = str[i];
                str[i] = temp;
            }
        }

    }
    public static void main(String[] args) {
        String str = "aab";
        ArrayList<String> list = permutation(str);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
