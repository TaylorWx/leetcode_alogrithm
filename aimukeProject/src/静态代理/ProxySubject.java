package 静态代理;

import javax.security.auth.*;

/**
 * Created by wangxin on 2018/4/25.
 */
public class ProxySubject implements Subject{
    RealSubject realSubject;
    public ProxySubject(RealSubject realSubject){
        this.realSubject=realSubject;
    }
    @Override
    public void hello() {
        realSubject.hello();
    }
}
