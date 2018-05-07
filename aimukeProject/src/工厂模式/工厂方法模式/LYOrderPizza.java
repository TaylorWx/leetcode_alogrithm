package 工厂模式.工厂方法模式;

import 工厂模式.简单工厂模式.*;
import 工厂模式.简单工厂模式.ChinesePizza;
import 工厂模式.简单工厂模式.FruitPizza;
import 工厂模式.简单工厂模式.Pizza;

/**
 * Created by wangxin on 2018/4/26.
 */
public class LYOrderPizza extends OrderPizza {
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
