package 工厂模式.抽象工厂模式;

import java.util.Scanner;

/**
 * Created by wangxin on 2018/4/26.
 */
public  class OrderPizza {
    public OrderPizza(AbstractFactory abstractFactory){
        Pizza pizza=null;
        String ordertype;
        do{
            ordertype=gettype();
            pizza=abstractFactory.createPizza(ordertype);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
        }while(true);
    }
    private String gettype(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("input pizza");
        return scanner.next();
    }
}
