package 工厂模式.抽象工厂模式;

/**
 * Created by wangxin on 2018/4/26.
 */
public abstract class Pizza {
    protected String name;

    public void setName(String name) {
        this.name = name;
    }
    public abstract void prepare();
    public void bake(){
        System.out.println(name+"baking");
    }
    public void cut(){
        System.out.println(name+"cuting");
    }
}
