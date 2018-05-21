package String;

/**
 * Created by wangxin on 2018/5/4.
 */
public class ReverseStringII {
    public static char[] reverse(char[] a,int start,int end){

        char temp;

        int length=end-start;

        //反转所有zifu

        for(int i=0;i<length/2;i++){

            temp=a[i+start];

            a[i+start]=a[end-i-1];

            a[end-i-1]=temp;

        }

        return a;



    }

    public static String reverseStr(String s, int k) {



        char []ch =s.toCharArray();

        int length=ch.length;

        int count=length;

        int flag=0;

        while(count>0){

            if(count<k){

                //反转所有zifu

                ch=reverse(ch,flag,length);

                break;

            }

            if(count>=k&&count<2*k){

                ch=reverse(ch,flag,flag+k);

                break;

            }

            if(count>=2*k){

                ch=reverse(ch,flag,flag+k);

                flag+=2*k;

                count=length-flag;

            }

        }

        return new String(ch);

    }

    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg",2));
    }
}
