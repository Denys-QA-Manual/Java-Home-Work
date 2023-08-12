package advanced_2;

import java.util.Scanner;

public class Circle implements Shape{
    Scanner sc = new Scanner(System.in);
    final float PI = 3.14f;
    @Override
    public void calculateArea() {
        System.out.println("Площа, що замикає коло радіусом r, дорівнює π * r * r");
        System.out.print("Введіть радіус кола: ");
        float radius = sc.nextFloat();
        float s = PI * radius * radius;
        System.out.println("Площа кола, радіусом r = " + radius + ", дорівнює " + s);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Окружність кола (особливий випадок периметра) розраховується за формулою: 2 * π * r");
        System.out.print("Введіть радіус кола: ");
        float radius = sc.nextFloat();
        float p = 2 * PI * radius;
        System.out.println("Периметр кола, радіусом r = " + radius + ", дорівнює " + p);
    }
}
