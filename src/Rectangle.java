public class Rectangle extends Figure implements Draw, Move, High {

    Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double getArea() { //вычисление площади прямоугольника
        return a * b;
    }

    @Override
    public double getPerimeter() { //вычисление периметра прямоугольника
        return (a + b) * 2;
    }

    @Override
    public void toDraw() { //вывод координат вершин прямоугольника
        double[] pointsX = {0, a, a, 0};
        double[] pointsY = {0, 0, b, b};
        for (int i = 0; i < pointsX.length; i++) {
            System.out.println("Координата " + i + " вершины прямоугольника = " + pointsX[i] + " по X, " + pointsY[i] + " по Y.");
        }

    }

    @Override
    public void toMove() { //вывод координат вершин прямоугольника при смещении
        double[] pointsX = {0, a, a, 0};
        double[] pointsY = {0, 0, b, b};
        for (int i = 0; i < pointsX.length; i++) {
            pointsX[i] = pointsX[i] + 10;
            pointsY[i] = pointsY[i] + 10;
            System.out.println("Координата " + i + " вершины прямоугольника = " + pointsX[i] + " по X, " + pointsY[i] + " по Y. При смещении на 10 пунктов");
        }
    }

    @Override
    public void toHigh() { //расчет и вывод координат центра примоугольника
        System.out.println("Координаты центра прямоугольника: " + a / 2 + " по X, " + b / 2 + " по Y.");
    }
}

