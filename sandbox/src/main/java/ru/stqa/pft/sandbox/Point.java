package ru.stqa.pft.sandbox;

public class Point {
    public double A;
    public double B;

    public Point(double x,double y){
        this.A = x;
        this.B = y;
    }

    public static double area(Point a,Point b){
        return Math.sqrt((((a.B - b.B) * (a.B - b.B) + (a.A - b.A) * (a.A - b.A))));
    }
}


//    X x1 = new X("a");
//    X x2 = new A("x1", "y1");
//    X x2 = new B("x2", "y2");

//    X x3 = new X("a", "b", "c");