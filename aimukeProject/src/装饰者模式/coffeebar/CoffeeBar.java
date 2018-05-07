package 装饰者模式.coffeebar;


import 装饰者模式.coffeebar.coffee.Decaf;
import 装饰者模式.coffeebar.coffee.LongBlack;
import 装饰者模式.coffeebar.decorator.Chocolate;
import 装饰者模式.coffeebar.decorator.Milk;

public class CoffeeBar {


	public static void main(String[] args) {
		Drink order;
		order=new Decaf();
		System.out.println("order1 price:"+order.cost());
		System.out.println("order1 desc:"+order.getDescription());
		
		System.out.println("****************");
		order=new LongBlack();
		order=new Milk(order);
		order=new Chocolate(order);
		order=new Chocolate(order);
		System.out.println("order2 price:"+order.cost());
		System.out.println("order2 desc:"+order.getDescription());
		
	}


}
