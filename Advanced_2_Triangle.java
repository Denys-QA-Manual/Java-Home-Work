package advanced_2;

import java.util.Scanner;

public class Triangle implements Shape {
    public void calculateArea() {
        System.out.println("Площа трикутника дорівнює пів добутку його основи на проведену до неї висоту");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть довжину основи трикутника: ");
        double a = sc.nextInt();
        System.out.print("Введіть довжину висоти, проведеної до основи: ");
        double b = sc.nextInt();
        double c = 0.5 * a * b;
        System.out.println("Площа трикутника із основою 'a' - " + a + "та висотою 'b' - " + b + ", дорівнює " + c);
    }

    public void calculatePerimeter() {
        System.out.println("Периметр трикутника дорівнює сумі усіх його сторін");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть довжину першої сторони трикутника: ");
        int a = sc.nextInt();
        System.out.print("Введіть довжину другої сторони трикутника: ");
        int b = sc.nextInt();
        System.out.print("введіть довжину третьої сторони трикутника: ");
        int c = sc.nextInt();
        int p = a + b + c;
        System.out.println("Периметр трикутника із сторонами " + a + ", " + b + ", " + c + ", дорівнює " + p);
    }
}
