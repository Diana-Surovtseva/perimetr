public class Triangle extends Figure {

    double side1;
    double side2;
    double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public static void definePerimetr(double side1, double side2, double side3){
        double Perimetr = side1 + side2 + side3;

    }

    @Override
    public String toString() {
        return "Triangle perimetr: " + definePerimeter();
    }
}
