package 动态代理;

import java.lang.reflect.Proxy;

/**
 * Created by wangxin on 2018/4/25.
 */
public class MatchService {
    public MatchService() {
        PersonBean joe = getPersonInfo("joe", "male", "running");
        PersonBean OwnerProxy = getOwnerProxy(joe);
        System.out.println("Name is " + OwnerProxy.getName());
        System.out.println("Interests is" + OwnerProxy.getInterests());
        OwnerProxy.setInterests("Basketball");
        System.out.println("Interests is" + OwnerProxy.getInterests());
        OwnerProxy.setHotOrNotRating(60);
        System.out.println("Rating is " + OwnerProxy.getHotOrNotRating());
        OwnerProxy.setHotOrNotRating(30);
        System.out.println("Rating is " + OwnerProxy.getHotOrNotRating());
        System.out.println("**************************");
        PersonBean noOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is " + noOwnerProxy.getName());
        System.out.println("Interests is" + noOwnerProxy.getInterests());
        noOwnerProxy.setInterests("Basketball");
        System.out.println("Interests is" + noOwnerProxy.getInterests());
        noOwnerProxy.setHotOrNotRating(60);
        System.out.println("Rating is " + noOwnerProxy.getHotOrNotRating());
    }

    PersonBean getPersonInfo(String name, String gender, String interests) {
        PersonBean personBean = new PersonBeanImpl();
        personBean.setName(name);
        personBean.setGender(gender);
        personBean.setInterests(interests);
        return personBean;
    }

    PersonBean getOwnerProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(), personBean.getClass().getInterfaces(), new OwnerInvocationHandler(personBean));
    }

    PersonBean getNonOwnerProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(), personBean.getClass().getInterfaces(), new NonOwnerInvocationHandler(personBean));
    }
}
