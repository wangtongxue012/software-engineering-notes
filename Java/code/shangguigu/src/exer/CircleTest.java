package exer;

import java.util.Scanner;

/*
 * 2.利用面向对象的编程方法，设计类Circle计算圆的面积。
 * */
//测试类
public class CircleTest {
	public static void main(String[] args) {
		System.out.println("请输入圆的半径radius：");
		Scanner scan=new Scanner(System.in);
		double radius=scan.nextDouble();
		Circle circle=new Circle();
		System.out.println("圆的面积为："+circle.findArea(radius));
	}
}
//圆
class Circle{
	//属性
	double radius=20;
	
	//求圆的面积
	public double findArea(double radius) {
		 double area=Math.PI*radius*radius;
		 return area;
	}
	
}
