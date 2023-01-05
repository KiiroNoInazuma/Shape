package shape.solidofrevolution;

import shape.SolidOfRevolution;

public class Cylinder extends SolidOfRevolution {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        setHeight(height);
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(getRadius(), 2) * height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
