class Rectangle extends Shape {
    private double height;
    private double width;
    Rectangle(){height=0;width=0;};
    void setHeight(double h){height=h;}
    void setWidth(double w){width=w;}
    double getHeight(){return height;}
    double getWidth(){return width;}
    void draw (){
        System.out.println("draw a rectangle");
    }
    void onAreaChange (){area=getHeight()*getWidth();}
}