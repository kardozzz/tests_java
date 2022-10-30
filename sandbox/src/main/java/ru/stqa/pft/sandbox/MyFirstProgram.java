package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String[] args) {
		Point a = new Point(2.2, 1.5);
		Point b = new Point(5.5, 2.5);

		Square s = new Square(5);
		System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

		Rectangle r = new Rectangle(4, 6);
		System.out.println("Площадь пряумоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());



		System.out.println("Расстояние между точкой а и точкой b = " + distance(a,b));

	}

	public static double distance(Point a, Point b) {
		double distance;
		return distance = Math.sqrt((((a.B - b.B) * (a.B - b.B) + (a.A - b.A) * (a.A - b.A))));
	}
}