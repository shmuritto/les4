public class Square extends Figure {

    Square(double a, double b) {
        super(a, b, 0, b, a/2, b/2);
    }


    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return (a + b) * 2;
    }

}
