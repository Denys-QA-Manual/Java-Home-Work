package advanced_2;

import java.util.Scanner;

public class Rectangle implements Shape{
    Scanner sc = new Scanner(System.in);

    public void calculateArea() {
        System.out.println("Щоб знайти площу прямокутника, треба його довжину помножити на ширину");
        System.out.print("Введіть довжину вашого прямокутника: ");
        int a = sc.nextInt();
        System.out.print("Введіть ширину вашого прямокутника: ");
        int b = sc.nextInt();
        int c = a * b;
        System.out.println("Площа прямокутника зі сторонами 'a' = " + a + ", 'b' = " + b + ", дорівнює " + c);
    }

    public void calculatePerimeter() {
        System.out.println("Периметр прямокутника - це сума довжин його сторін");
        System.out.print("Введіть довжину вашого прямокутника: ");
        int a = sc.nextInt();
        System.out.print("Введіть ширину вашого прямокутника: ");
        int b = sc.nextInt();
        int p = 2 * (a + b);
        System.out.println("Периметр прямокутника зі сторонами 'a' = " + a + ", 'b' = " + b + ", дорівнює " + p);
    }
}
