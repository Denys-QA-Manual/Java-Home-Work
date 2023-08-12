package advanced_2;

import org.checkerframework.checker.units.qual.C;
import org.w3c.dom.css.Rect;

public class Main {
    public static void main(String[] args) {
        Shape c = new Circle();
        Shape r = new Rectangle();
        Shape t = new Triangle();

        Shape [] shapeArr = {c, r, t};
        for (Shape shape : shapeArr) {
            shape.calculateArea();
            shape.calculatePerimeter();
            System.out.println("-----");
        }
    }
}
