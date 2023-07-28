/*
Написати метод, який повертатиме total (total = price * qty * 0.8)
Price може бути як цілим числом, так і дробовим
Метод повинен приймати значення price та qty (значення можете задати самостійно)
Вивести у консоль "Your total = " + результат
 */

import java.util.Scanner;

public class test11_methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Price:");
        double price = sc.nextDouble();
        System.out.println("Please enter Quantity:");
        int quantity = sc.nextInt();

        System.out.println("Your total: " + total(price, quantity));

    }

    static double total(double price, int quantity) {
        return price * quantity;
    }
}
