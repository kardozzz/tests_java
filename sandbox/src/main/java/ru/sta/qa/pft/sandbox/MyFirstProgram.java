package ru.sta.qa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String[] args) {
		Point a = new Point(2.2,5.5);
		Point b = new Point(5.5,5.5);

		System.out.println("Расстояние между точкой а и точкой b = " + area(p));

	}
	public static double area(Point p){
		return Math.sqrt((((p.A + p.B) * (p.A + p.B) - (p.A + p.B) * (p.A + p.B))));
	}

}
