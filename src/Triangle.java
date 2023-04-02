public class Triangle extends Figure implements Move, Draw, High {

    double halfP = (a + b + c) / 2;  //полупериметр
    double high = 2 * Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c)) / a; // расчет высоты через формулу герона
    double cYPoint = Math.sqrt(Math.abs(Math.pow(a, 2) - Math.pow(high, 2))); //координата точки С по Y

    Triangle(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public double getArea() { //расчет площади треугольника
        return (Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c)));
    }

    @Override
    public double getPerimeter() { //расчет периметра треугольника
        return a + b + c;
    }


    @Override
    public void toDraw() { //вывод координат вершин треугольника
        double[] pointsX = {0, a, high};
        double[] pointsY = {0, 0, cYPoint};
        for (int i = 0; i < pointsX.length; i++) {
            System.out.print("Координата " + i + " вершины треугольника = ");
            System.out.printf("%.2f", pointsX[i]);
            System.out.print(" по X, ");
            System.out.printf("%.2f", pointsY[i]);
            System.out.println(" по Y.");
        }
    }

    @Override
    public void toMove() { //вывод координат вершин прямоугольника при смещении
        double[] pointsX = {0, a, high};
        double[] pointsY = {0, 0, cYPoint};
        for (int i = 0; i < pointsX.length; i++) {
            pointsX[i] = pointsX[i] + 10;
            pointsY[i] = pointsY[i] + 10;
            System.out.print("Координата " + i + " вершины треугольника = ");
            System.out.printf("%.2f", pointsX[i]);
            System.out.print(" по X, ");
            System.out.printf("%.2f", pointsY[i]);
            System.out.println(" по Y.");
        }
    }

    @Override
    public void toHigh() { //расчет и вывод координат центра треугольника
        System.out.print("Координаты центра треугольника: ");
        System.out.printf("%.2f", (a + high) / 3);
        System.out.print(" по X, ");
        System.out.printf("%.2f", cYPoint / 3);
        System.out.println(" по Y.");

    }
}