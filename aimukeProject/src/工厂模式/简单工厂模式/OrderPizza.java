package 工厂模式.简单工厂模式;

import java.util.Scanner;

/**
 * Created by wangxin on 2018/4/26.
 */
public class OrderPizza {
    private SimplePizzaFactory simplePizzaFactory;
    public OrderPizza(SimplePizzaFactory simplePizzaFactory){
        setFactory(simplePizzaFactory);
    }
    public void setFactory(SimplePizzaFactory simplePizzaFactory){
        Pizza pizza=null;
        String ordertype;
        do{
            ordertype=gettype();
            this.simplePizzaFactory=simplePizzaFactory;
            pizza=simplePizzaFactory.createPizza(ordertype);
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
