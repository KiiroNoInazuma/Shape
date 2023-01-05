import box.Box;
import shape.Pyramid;
import shape.Shape;

public class Launch {
    public static void main(String[] args) {
        Pyramid per = new Pyramid();
        per.setS(10);
        per.setH(10);
        Box<Pyramid>box = new Box<>();
        box.setSize(10);
        System.out.println(box.add(per));

    }
}
