package String;

/**
 * Created by wangxin on 2018/4/27.
 */
public class JudgeRouteCircle {
    public boolean judgeCircle(String moves) {
        int p=0,q=0;
        for(int i=0;i<moves.length();i++){
            char ch=moves.charAt(i);
            switch (ch){
                case 'R':
                    p++;break;
                case 'L':
                    p--;break;
                case 'U':
                    q++;break;
                case 'D':
                    q--;break;
                default:
                    break;
            }
        }
        if(p==0&&q==0)
            return true;
        else
            return false;
    }
}
