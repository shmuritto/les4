public class Calc {
    public static void main(String[] args) {
        Square box = new Square(5, 5);
        System.out.println(box.getArea());
        System.out.println(box.getPerimeter());
        System.out.println(box.x);
        System.out.println(box.y);

        Rectangle rec = new Rectangle(3, 4, 5);
        System.out.println(rec.getPerimeter());
        System.out.println(rec.getArea());
        System.out.println(rec.h);
    }
}
