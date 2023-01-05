import box.Box;
import shape.Pyramid;
import shape.Shape;
import shape.solidofrevolution.Ball;
import shape.solidofrevolution.Cylinder;


public class Launch {
    public static void main(String[] args) {
        Pyramid per = new Pyramid(10, 20);
        Ball ball = new Ball(1);
        Cylinder cylinder = new Cylinder(10, 2);
        per.setS(10);
        per.setH(10);
        Box<Shape> box = new Box<>();
        box.setSize(1000);
        System.out.println(box.add(per, ball, cylinder));

    }
}
