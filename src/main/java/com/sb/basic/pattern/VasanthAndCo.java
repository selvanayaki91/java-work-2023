package com.sb.basic.pattern;

public class VasanthAndCo {
String brand;
String name;
int screensize,price;

public static void main(String[] args) {
	VasanthAndCo tv= new VasanthAndCo();
	tv.name="S123";
	tv.brand="sony";
	tv.screensize=40;
	tv.price=20000;
	tv.buy(tv.price);
	//current object of same class
	VasanthAndCo salesman = new VasanthAndCo();
	salesman.name="Raghu";
	salesman.delivery(tv);
	
	
}
//passing objects as arguments
 private void delivery(VasanthAndCo tv) {
	// TODO Auto-generated method stub
	System.out.println(tv.screensize);
	System.out.println(tv.brand);
	System.out.println(this.name);
	
}

private void buy(int price) {
	// TODO Auto-generated method stub
	System.out.println(price);
	System.out.println(this.name);
//	delivery(this);
}


}
