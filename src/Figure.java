public abstract class Figure {
    double a , b, c; //длины сторон
    //double h; //высота
    //double x, y;  координаты центра расчитываются позже

    Figure(double a, double b, double c) { //для треугольника
        this.a = a;
        this.b = b;
        this.c = c;
    }

    Figure(double a, double b) { //для прямогульника
        this.a = a;
        this.b = b;
    }

    public abstract double getArea(); //вычисление площади

    public abstract double getPerimeter(); //вычисление периметра


}
