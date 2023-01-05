package shape;

public class Pyramid extends Shape {
    private double s;
    private double h;

    public Pyramid(double s, double h) {
        setS(s);
        setH(h);
    }

    public double getVolume() {
        return s * h / 3;
    }

    public void setS(double s) {
        this.s = s;
    }

    public void setH(double h) {
        this.h = h;
    }
}
