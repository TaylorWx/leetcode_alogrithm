package 工厂模式.简单工厂模式;

/**
 * Created by wangxin on 2018/4/26.
 */
public class FruitPizza extends Pizza {

    @Override
    public void prepare() {
        super.setName("fruit");
        System.out.println(name + "preparing");
    }
}
