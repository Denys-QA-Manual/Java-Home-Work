/*
Створити масив array з 5 імен ("John", "Dan", "Ashe", "Carl", "Bill")
Відсортуйте масив за абеткою
Додайте до кінця новий елемент масиву - "Stan"
Виведіть у стопку всі елементи масиву (кожне ім'я має бути з нового рядка)
 */

import java.util.Arrays;

public class test10_array2 {
    public static void main(String[] args) {
        String [] array = {"John", "Dan", "Ashe", "Carl", "Bill"};
        System.out.println("Початковий масив імен: " + Arrays.toString(array));

        System.out.println("\nВідсортований масив імен у стовпчик із новим іменем 'Stan':");
        Arrays.sort(array);

        String [] biggerArray = Arrays.copyOf(array, array.length + 1);
        biggerArray[array.length] = "Stan";

        for (String Ar : biggerArray) {
            System.out.println(Ar);
        }
    }
}
