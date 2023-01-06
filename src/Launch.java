import box.Box;
import shape.Shape;
import shape.solidofrevolution.Ball;

public class Launch {
    public static void main(String[] args) {
        Ball ball = new Ball(2);
        Box<Shape> box = new Box<>();
        box.setSize(35);
        System.out.println(box.add(ball));
        System.out.printf("%.2f",ball.getVolume());
    }
}
