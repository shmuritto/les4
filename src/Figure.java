public abstract class Figure {
    double a , b, c; //длины сторон
    double h; //высота
    double x, y; // координаты центра

    Figure(double a, double b, double c, double h, double x, double y) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
        this.x = x;
        this.y = y;

    }


    public abstract double getArea();
    public abstract double getPerimeter();
}

