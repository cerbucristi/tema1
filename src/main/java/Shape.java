abstract class Shape {
    protected double area;
    abstract void draw ();
    Shape(){area = 0;}
    double getArea() {return area;}
    abstract void onAreaChange();
}
