package advanced_3;

public class Main {
    public static void main(String[] args) {
        Bus.Engine myBus = new Bus().new Engine();
        myBus.start();
        myBus.stop();
        myBus.autoControl();
        System.out.println("------");
        myBus.autoControl();
    }
}
