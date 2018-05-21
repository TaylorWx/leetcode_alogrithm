package swordOffer;

/**
 * Created by wangxin on 2018/5/17.
 */
public class BigIntegers {
    public static void printBigInteger(int n){
        if(n<=0)
            return;
        //使用一个StringBulider非线程安全
        StringBuilder number=new StringBuilder();
        //初始化
        for(int i=0;i<n;i++)
            number.append('0');
        while(!increment(number))//当最高位位9的时候则跳出
            printNumber(number);
    }
    public static boolean increment(StringBuilder num){
        //判断是否溢出
        boolean isOverflow = false;
        //是否进位
        int nTakeOver = 0;
        int nLength = num.length();
        for(int i = nLength - 1; i >= 0; i--){
            int nSum = num.charAt(i) - '0' + nTakeOver;
            if( i == nLength - 1){
                nSum++;
            }
            if(nSum >= 10){
                if(i == 0){
                    isOverflow = true;
                }else{
                    nSum -= 10;
                    nTakeOver = 1;
                    num.setCharAt(i, (char) ('0' + nSum));
                }

            }else{
                num.setCharAt(i, (char) ('0' + nSum));
                break;
            }
        }
        return isOverflow;
    }
    public static void printNumber(StringBuilder num){
        boolean isBeginning0 = true;
        for(int i = 0; i < num.length(); i++){
            if(isBeginning0 && num.charAt(i) != '0'){
                isBeginning0 = false;
            }
            if(!isBeginning0){
                System.out.print(num.charAt(i));
            }
        }

        System.out.println();
    }
    public static void main(String[] args) {
        printBigInteger(2);
    }
}
