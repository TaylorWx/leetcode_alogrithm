package 工厂模式.抽象工厂模式;



/**
 * Created by wangxin on 2018/4/26.
 */
public interface AbstractFactory {
    public Pizza createPizza(String ordertype);
}
