public class Square extends Figure {
    public Square(double side1) {
        super(side1);
    }

    @Override
    public String toString() {
        return "Square perimetr: " + definePerimeter();
    }
}



