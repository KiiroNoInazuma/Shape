package shape.solidofrevolution;


import shape.SolidOfRevolution;

public class Ball extends SolidOfRevolution {

    public Ball(double radius) {
        super(radius);
    }


    @Override
    public double getVolume() {
        return 4 * Math.PI * Math.pow(getRadius(), 3) / 3;
    }
}
