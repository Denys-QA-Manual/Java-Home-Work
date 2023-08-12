package Advanced_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Phone iPhone = new Phone();
        Phone samsung = new Phone();
        Phone huawei = new Phone();

        Phone [] phonesArray = {iPhone, samsung, huawei};

        fillPhoneValues(phonesArray);
        printPhoneValues(phonesArray);
    }

   static void fillPhoneValues (Phone [] phonesArray) {
        for (int i = 0; i < phonesArray.length; i++) {
            System.out.println("Enter the next values for the " + (i + 1) + " phone");
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter the Model of " + (i + 1) + " phone: ");
            String model = sc.nextLine();
            phonesArray[i].setModel(model);
            System.out.print("Please enter the Number of " + model + ": ");
            int number = sc.nextInt();
            phonesArray[i].setNumber(number);
            System.out.print("Please enter the Weight of " + model + ": ");
            int weight = sc.nextInt();
            phonesArray[i].setWeight(weight);
        }
   }

   static void printPhoneValues (Phone [] phonesArray) {
        for (int i = 0; i < phonesArray.length; i++) {
            System.out.println(phonesArray[i].getModel() + ":");
            System.out.println("Model is '" + phonesArray[i].getModel() + "'");
            System.out.println("Number is '" + phonesArray[i].getNumber() + "'");
            System.out.println("Weight is '" + phonesArray[i].getWeight() + "' gr");
            System.out.println("_________________________");
        }
   }

}
