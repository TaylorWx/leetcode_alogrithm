package 工厂模式.抽象工厂模式;


/**
 * Created by wangxin on 2018/4/26.
 */
public class Main {
    public static void main(String[] args) {

        OrderPizza orderPizza= new OrderPizza(new LYOrderPizza());
    }
}
