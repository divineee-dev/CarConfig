import models.Car;
import models.CarModel;

import java.util.Scanner;

public class Main {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int moneyCounter;

        System.out.println("Choose your Car!");
        System.out.println("--------------------");
        System.out.println();
        System.out.println("Choose your Category.");
        System.out.println("Suv, Limo, Coupe, Cabrio");
        String inputCategory = scanner.nextLine();

        if (inputCategory.equals("Suv")){
            String suvModel = scanner.nextLine();
        }
        System.out.println(inputCategory);



    }

}