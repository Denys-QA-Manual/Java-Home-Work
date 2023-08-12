package advanced_3;

import java.util.Scanner;

public class Bus {
    private int defaultSpeed = 60;
    int requiredSpeed;
    Scanner sc = new Scanner(System.in);

      public class Engine {
          void start() {
              System.out.println("Двигун автобуса заведено");
          }

          void stop() {
              System.out.println("Двигун автобуса було вимкнено");
          }

          void autoControl() {
              System.out.println("Двигун автобуса переведено в режим автокерування. Завершіть налаштування");
              System.out.print("Обрати швидкість за замовчуванням? Так / Ні: ");
              String defaultOrNot = sc.next();
              if (defaultOrNot.equals("Так")) {
                  System.out.println("Обрано швидкість за замовчуванням: " + defaultSpeed + " км/год");
              } else if (defaultOrNot.equals("Ні")) {
                  System.out.print("Оберіть бажану швидкість: ");
                  requiredSpeed = sc.nextInt();
                  System.out.println("Обрана швидкість: " + requiredSpeed +" км/год. Не забувайте: автобус везе вас сам, тож займайтеся власними справами. Гарної дороги!");
                  }
              }
          }
}
