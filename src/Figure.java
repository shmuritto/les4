public abstract class Figure {
    int a , b, c; //длины сторон
    float h; //высота
    float x, y; // координаты центра

    Figure(int a, int b, int c, float h, float x, float y) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
        this.x = x;
        this.y = y;
    }


    public abstract float getArea();
    public abstract float getPerimeter();
}

