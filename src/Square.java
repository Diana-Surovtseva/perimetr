public class Square extends Figure {

    double side1;

    public Square(double side1) {
        this.side1 = side1;
    }
    public static void definePerimetr(double side1){
        double perimetr = 4 * side1;
    }

    @Override
    public String toString() {
        return "Square perimetr: " + definePerimetr();
    }

}



