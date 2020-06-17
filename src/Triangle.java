public class Triangle extends Figure {
    public Triangle(double side1, double side2, double side3) {
        super(side1, side2, side3);
    }

    @Override
    public String toString() {
        return "Triangle perimetr: " + definePerimeter();
    }
}
