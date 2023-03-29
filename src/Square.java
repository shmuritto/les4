public class Square extends Figure {

    Square(int a, int b, int c, float h, float x, float y) {
        super(a, b, c, h, x, y);
    }

    @Override
    public float getArea() {
        return a * b;
    }

    @Override
    public float getPerimeter() {
        return (a + b) * 2;
    }
}
