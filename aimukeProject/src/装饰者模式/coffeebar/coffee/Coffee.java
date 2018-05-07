package 装饰者模式.coffeebar.coffee;


import 装饰者模式.coffeebar.Drink;

public  class Coffee extends Drink {

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return super.getPrice();
	}

	
}
