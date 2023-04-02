public class Calc {
    public static void main(String[] args) {
        Figure figure;
        Rectangle box = new Rectangle(1, 1);
        System.out.println("Площадь прямоугольника: " + box.getArea());
        System.out.println("Периметр прямоугольника: " + box.getPerimeter());
        box.toHigh();
        box.toDraw();
        box.toMove();


        Triangle tri = new Triangle(3, 3, 5);
        System.out.println("Площадь треугольника: " + tri.getArea());
        System.out.println("Периметр треугольника: " + tri.getPerimeter());
        System.out.println("Высота треугольника: " + tri.high);
        tri.toHigh();
        tri.toDraw();
        tri.toMove();


        Figure box1 = new Rectangle(11, 12);
        Figure tri1 = new Triangle(11, 12, 13);
        figure = box1;
        System.out.println(figure.getPerimeter());
        System.out.println(figure.getArea());
        figure = tri1;
        System.out.println(figure.getPerimeter());
        System.out.println(figure.getArea());

        //GraphicsMain gm = new GraphicsMain(); //вывод фигур на экран
    }
}