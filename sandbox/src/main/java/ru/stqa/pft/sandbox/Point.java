package ru.stqa.pft.sandbox;

public class Point {
    public double x;
    public double y;


    public static double distance(Point a,Point b){
        double distance;
        return distance = Math.sqrt((((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y))));
    }


    public Point(double x,double y){
        this.x = x;
        this.y = y;
    }


    public double distance (Point b){
        return Math.sqrt((this.y - b.y) * (this.y - b.y) + (this.x - b.x) * (this.x - b.x));
    }


}


//    X x1 = new X("a");
//    X x2 = new A("x1", "y1");
//    X x2 = new B("x2", "y2");

//    X x3 = new X("a", "b", "c");