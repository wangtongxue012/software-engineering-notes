package exer;

import java.util.Scanner;

/*
 * 2.�����������ı�̷����������Circle����Բ�������
 * */
//������
public class CircleTest {
	public static void main(String[] args) {
		System.out.println("������Բ�İ뾶radius��");
		Scanner scan=new Scanner(System.in);
		double radius=scan.nextDouble();
		Circle circle=new Circle();
		System.out.println("Բ�����Ϊ��"+circle.findArea(radius));
	}
}
//Բ
class Circle{
	//����
	double radius=20;
	
	//��Բ�����
	public double findArea(double radius) {
		 double area=Math.PI*radius*radius;
		 return area;
	}
	
}
