package box;

import shape.Shape;

public class Box<T extends Shape> {
    private double size;

    public void box(double size) {
        this.size = size;
    }

    @SafeVarargs
    public final boolean add(T... shape) {
        double result = 0;
        for (T t : shape) {
            result += t.getVolume();
        }
        return result < size;
    }


}
