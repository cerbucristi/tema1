 class Circle extends Shape {
    private double radius;
    private double pi;
    Circle (int r) {radius=r;
        pi=3.14;
    }
    void setRadius(int r){radius=r;}
    double getPi (){return pi;}
    double getRadius() {return radius;}
    void onAreaChange(){area = getPi()*getRadius()*getRadius();}
   void draw (){
       System.out.println("draw a circle");
   }
}
