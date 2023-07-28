/*
Написати 2 методи:
- Перший метод повинен приймати як параметр ім'я користувача (одне з трьох - "Alex", "John", "Stan") та
виводити в консоль текст "Hello [ім'я]"
- Другий метод повинен приймати як параметр ім'я, яке було введено у першому методі та виводити у
консоль номер місця (1, 2 або 3) з відповідним текстом ("Your seat is [номер місця]")
Якщо ім'я не "Alex", "John" або "Stan" - вивести в консоль "Sorry, name was not found"
 */

import java.util.Scanner;

public class test12_methods2 {
    public static void main(String[] args) {
        String [] array = {"Alex", "John", "Stan"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String userName = sc.nextLine();

        name(userName, array);
        place(userName, array);

    }

    static void name (String s, String [] arr) {
        String foundName = "Sorry, name was not found";
        for (String arrName : arr) {
            if (arrName.equals(s)) {
                foundName = "Hello, " + arrName;
            }
        }
        System.out.println(foundName);
    }

    static void place (String name, String [] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (name.equals(arr[i]))
                System.out.println("Your seat is: " + (i+1));
        }
    }
}
