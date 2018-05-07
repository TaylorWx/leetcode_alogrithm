package 静态代理;

import javax.security.auth.*;

/**
 * Created by wangxin on 2018/4/25.
 */
public class RealSubject implements Subject{
    @Override
    public void hello() {
        System.out.println("wo daode");
    }
}
