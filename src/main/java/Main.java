
public class Main {
    public static void main(String []args){
        Circle s = new Circle(1);
        s.draw();
        s.onAreaChange();
        System.out.println(s.getArea());

        Triangle t =new Triangle();
        t.setBase(2);
        t.setHeight(1);
        t.draw();
        t.onAreaChange();
        System.out.println(t.getArea());

        Rectangle r= new Rectangle();
        r.setHeight(4);
        r.setWidth(2);
        r.draw();
        r.onAreaChange();
        System.out.println(r.getArea());
    }
}
