package 装饰者模式.coffeebar.decorator;


import 装饰者模式.coffeebar.Drink;

public class Soy extends Decorator {

	public Soy(Drink Obj) {
		super(Obj);
		// TODO Auto-generated constructor stub
		super.setDescription("Soy");
		super.setPrice(1.5f);
	}

}

