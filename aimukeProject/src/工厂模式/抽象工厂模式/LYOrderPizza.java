package 工厂模式.抽象工厂模式;



/**
 * Created by wangxin on 2018/4/26.
 */
public class LYOrderPizza implements AbstractFactory {
    @Override
    public Pizza createPizza(String ordertype) {
        Pizza pizza=null;
        if(ordertype.equals("fruit")){
            pizza=new FruitPizza();
        }else if(ordertype.equals("chinese")){
            pizza=new ChinesePizza();
        }
        return pizza;
    }
}
