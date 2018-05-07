package 工厂模式.工厂方法模式;

import 工厂模式.简单工厂模式.Pizza;
import 工厂模式.简单工厂模式.SimplePizzaFactory;

import java.util.Scanner;

/**
 * Created by wangxin on 2018/4/26.
 */
public abstract class OrderPizza {
    public OrderPizza(){
        Pizza pizza=null;
        String ordertype;
        do{
            ordertype=gettype();
            pizza=createPizza(ordertype);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
        }while(true);
    }
    public abstract Pizza createPizza(String ordertype);

    private String gettype(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("input pizza");
        return scanner.next();
    }
}
