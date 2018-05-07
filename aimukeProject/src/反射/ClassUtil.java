package 反射;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by wangxin on 2018/4/24.
 */
public class ClassUtil {
    public static void printClassMethodMessage(Object obj){
        //通过对象获得这个对象类的类类型
        Class type=obj.getClass();
        System.out.println(type.getName());
        Method[] methods = type.getMethods();//获得本类以及父类的public信息，还有一个是获得本类的所有方法信息
        for(int i=0;i<methods.length;i++){
            Class returnType = methods[i].getReturnType();
            //得到返回值名称
            System.out.print(returnType.getName()+" ");
            //得到方法的名称
            System.out.print(methods[i].getName()+"(");
            //得到方法的参数
            Class[] params = methods[i].getParameterTypes();
            for(Class cla:params){
                System.out.print(cla.getName()+",");
            }
            System.out.println(")");
        }


    }
    public static void getClassFieldMessage(Object obj){
        Class type=obj.getClass();
        //得到所有public 的成员变量类型
        Field[] fields=type.getDeclaredFields();
        for(Field field:fields){
            Class tye=field.getType();
            System.out.print(tye.getName() + " ");
            System.out.println(field.getName());
        }

    }

    public static void getConMessage(Object obj){
        Class type=obj.getClass();
        Constructor[] cs =type.getDeclaredConstructors();
        for(Constructor constructor:cs){
            System.out.print(constructor.getName() +"(");
            Class[] paramTypes = constructor.getParameterTypes();
            for(Class param:paramTypes){
                System.out.print(param.getName()+",");
            }
            System.out.println(")");
        }
    }
}
