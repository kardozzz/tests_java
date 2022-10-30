package ru.sta.qa.pft.sandbox;

import static ru.sta.qa.pft.sandbox.Point.area;

public class MyFirstProgram {

	public static void main(String[] args) {
		Point a = new Point(2.2, 1.5);
		Point b = new Point(5.5, 2.5);

		System.out.println("Расстояние между точкой а и точкой b = " + distance(a,b));

	}

	public static double distance(Point a, Point b) {
		double distance;
		return distance = Math.sqrt((((a.B - b.B) * (a.B - b.B) + (a.A - b.A) * (a.A - b.A))));
	}
}