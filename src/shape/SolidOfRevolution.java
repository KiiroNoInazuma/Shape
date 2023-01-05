package shape;

public class SolidOfRevolution extends Shape {

    private double radius;

    double getRadius(){
        return radius;
    }

    @Override
    protected double getVolume() {
        return 0;
    }
}
