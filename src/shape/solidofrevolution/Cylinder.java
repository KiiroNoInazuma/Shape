package shape.solidofrevolution;


import shape.SolidOfRevolution;

public class Cylinder extends SolidOfRevolution {

    private double height;

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(getRadius(), 2) * height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
