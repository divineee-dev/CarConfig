import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String inputCategory;
    static String inputModel;


    static int moneyCounter = 0;



    public static void main(String[]args){

        System.out.println("Choose your Car!");
        System.out.println("--------------------");
        System.out.println();
        System.out.println("Choose your Category.");
        System.out.println("Suv, Limo, Coupe, Cabrio");
        chooseCategory();



    }

    public static void chooseCategory(){
        inputCategory = scanner.nextLine();

        switch (inputCategory){
            case "Suv":
                chooseSuv();
                break;
            case "Limo":
                chooseLimo();
                break;
            case "Coupe":
                chooseCoupe();
                break;
            case "Cabrio":
                chooseCabrio();
                break;
            default:
                System.out.println("Type the exact word");
                chooseCategory();
        }
    }

    public static void chooseSuv(){
        System.out.println("Choose your Model");
        System.out.println("Cayenne, Macan");
        inputModel = scanner.nextLine();

        switch (inputModel){
            case "Cayenne":
                moneyCounter =+ 80000;
                System.out.println("Current car costs: " + moneyCounter);

                // OPEN METHOD
                break;
            case "Macan":
                moneyCounter =+ 60000;
                System.out.println("Current car costs: " + moneyCounter);

                // OPEN METHOD
                break;
            default:
                System.out.println("Type the exact word");
                chooseSuv();
        }
    }
    public static void chooseLimo(){
        System.out.println("Choose your Model");
        System.out.println("Taycan, Panamera");
        inputModel = scanner.nextLine();

        switch (inputModel){
            case "Taycan":
                moneyCounter =+ 120000;
                System.out.println("Current car costs: " + moneyCounter);

                // OPEN METHOD
                break;
            case "Panamera":
                moneyCounter =+ 130000;
                System.out.println("Current car costs: " + moneyCounter);

                // OPEN METHOD
                break;
            default:
                System.out.println("Type the exact word");
                chooseLimo();
        }
    }
    public static void chooseCoupe(){
        System.out.println("Choose your Model");
        System.out.println("911 Turbo S, 718 Boxster");
        inputModel = scanner.nextLine();

        switch (inputModel){
            case "911 Turbo S":
                moneyCounter =+ 150000;
                System.out.println("Current car costs: " + moneyCounter);
                // OPEN METHOD
                break;
            case "718 Boxster":
                moneyCounter =+ 80000;
                System.out.println("Current car costs: " + moneyCounter);

                // OPEN METHOD
                break;
            default:
                System.out.println("Type the exact word");
                chooseCoupe();
        }
    }
    public static void chooseCabrio(){
        System.out.println("Choose your Model");
        System.out.println("911 Cabrio, 718 Cabrio");
        inputModel = scanner.nextLine();

        switch (inputModel){
            case "911 Cabrio":
                moneyCounter =+ 160000;
                System.out.println("Current car costs: " + moneyCounter);

                // OPEN METHOD
                break;
            case "718 Cabrio":
                moneyCounter =+ 90000;
                System.out.println("Current car costs: " + moneyCounter);

                // OPEN METHOD
                break;
            default:
                System.out.println("Type the exact word");
                chooseCabrio();
        }
    }


}