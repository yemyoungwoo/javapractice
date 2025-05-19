package test3;
// 상품화 component
public class Add {
	int x,y;
	int z;
	
	public Add() {
		x = (int)(Math.random()*100); //0~99
		y = (int)(Math.random()*100); //0~99
	}
	public void add() {
		//int z=x+y;
		//System.out.printf("%d+%d=%d\n",x,y,z); // instance x+y
		z = x+y;
	}
	public void result(String op) {
		System.out.printf("%d%s%d=%d\n",x,op,y,z);
	}
}
