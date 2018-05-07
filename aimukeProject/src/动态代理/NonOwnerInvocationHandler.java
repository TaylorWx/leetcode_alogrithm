package 动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by wangxin on 2018/4/25.
 */
public class NonOwnerInvocationHandler implements InvocationHandler{
    PersonBean personBean;
    public NonOwnerInvocationHandler(PersonBean personBean){
        this.personBean=personBean;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().startsWith("get")){
            return method.invoke(personBean,args);
        }else if(method.getName().equals("setHotOrNotRating")){
            return method.invoke(personBean,args);
        }else if(method.getName().startsWith("set")){
            return new IllegalAccessException();
        }
        return null;
    }
}
