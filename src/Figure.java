public class Figure {



    double side1;
    double side2;
    double side3;

    public Figure(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Figure(double side1) {
        this.side1 = side1;
    }
    
public static void definePerimeter(double side1, double side2, double side3){
double perimetr = side1 + side2 + side3;

    }

    @Override
    public String toString() {
        return "Figure perimetr: " + definePerimeter();
    }
}
