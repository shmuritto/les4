public class Rectangle extends Figure{

    double halfP = (a + b + c) / 2;
    Rectangle(double a, double b, double c) {
        super(a, b, c, 2 * Math.sqrt((a + b + c) / 2 * ((a + b + c) / 2 - a) * ((a + b + c) / 2 - b) * ((a + b + c) / 2 - c))/b, a/2, b/2);
    }
    @Override
    public double getArea() {
        return (Math.sqrt(halfP * (halfP - a) * (halfP - b)*(halfP - c)));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;

    }
}
