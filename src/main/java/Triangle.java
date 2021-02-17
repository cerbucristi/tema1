class Triangle extends Shape {

    private double base;
    private double height;
    Triangle(){base=0;height=0;}
    void setBase(double b){base=b;}
    void setHeight(double h){height=h;}
    double getHeight(){return height;}
    double getBase(){return base;}

    void draw (){
        System.out.println("draw a triangle");
    }
    void onAreaChange () {area=getBase()*getHeight()/2.0;}
}