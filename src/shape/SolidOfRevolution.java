package shape;


public abstract class SolidOfRevolution extends Shape {

    private double radius;


   protected SolidOfRevolution(double radius){
        setRadius(radius);
    }
    protected double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


}
