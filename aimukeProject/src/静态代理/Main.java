package 静态代理;

/**
 * Created by wangxin on 2018/4/25.
 */
public class Main {
    public static void main(String[] args) {
        Subject subject=new ProxySubject(new RealSubject());
        System.out.println("before");
        subject.hello();
    }
}
