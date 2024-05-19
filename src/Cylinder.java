public class Cylinder extends SolidOfRevolution{
    private double height;

    public Cylinder(double radius, double height) {
        super(height * 3.1415 * Math.pow(radius, 2), radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}
