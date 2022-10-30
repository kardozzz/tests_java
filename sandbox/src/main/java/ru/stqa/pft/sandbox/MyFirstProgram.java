package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String[] args) {

		Square s = new Square(5);
		System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

		Rectangle r = new Rectangle(4, 6);
		System.out.println("Площадь пряумоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

		Point a = new Point(4,6);
		Point b = new Point(2,7);

		System.out.println("Расстояние между точкой а и точкой b = " + Point.distance(a,b));
		System.out.println("Расстояние между точкой a и точкой b = " + a.distance(b));

	}

}
