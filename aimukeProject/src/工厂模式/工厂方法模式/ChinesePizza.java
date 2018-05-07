package 工厂模式.工厂方法模式;

import 工厂模式.简单工厂模式.Pizza;

/**
 * Created by wangxin on 2018/4/26.
 */
public class ChinesePizza extends Pizza {
    @Override
    public void prepare() {
        super.setName("chinese");
        System.out.println(name+"preparing");
    }
}
