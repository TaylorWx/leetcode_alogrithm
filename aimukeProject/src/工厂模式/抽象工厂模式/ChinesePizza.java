package 工厂模式.抽象工厂模式;

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
