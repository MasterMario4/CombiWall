public class Pile {
    private String name;
    private double area;
    private double inertia;
    private double height;
    private double length;
    private double centre;

    public Pile(String name, double area, double inertia, double height, double length, double centre) {
        this.name = name;
        this.area = area; //cm2
        this.inertia = inertia; //cm4
        this.height = height; //cm
        this.length = length; //cm
        this.centre = centre; //cm
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    public double getInertia() {
        return inertia;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public double getCentre() {
        return centre;
    }

    @Override
    public String toString() {
        double modulus = getInertia() / getHeight() * 2;
        return getName() + "   " + getArea() + "   " + getInertia() + "   " + modulus + "   " + getLength();
    }
}
