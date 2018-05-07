package 反射;

/**
 * Created by wangxin on 2018/4/24.
 */
public class ClassMain {
    public static void main(String[] args) {
        Class c1=Foo.class;
        try{
            Foo foo=(Foo) c1.newInstance();
        }catch (Exception e){

        }
    }
}
class Foo{
    private int c;
    public Foo(int c){
        this.c=c;
    };
}
