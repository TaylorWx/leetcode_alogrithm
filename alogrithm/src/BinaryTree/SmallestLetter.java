package BinaryTree;

/**
 * Created by wangxin on 2018/4/27.
 */
public class SmallestLetter {
    public static char nextGreatestLetter(char[] letters, char target) {
        int n=letters.length-1;
        if(target>=letters[n]){
            return letters[0];
        }else{
            for(int i=0;i<letters.length;i++){
                if(letters[i] > target)
                    return letters[i];
            }
        }
        return letters[0];
    }

    public static void main(String[] args) {
        char[] letters={'c', 'f', 'j'};
        System.out.println(nextGreatestLetter(letters,'k'));
    }
}
