import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String inputCategory;
    static String inputModel;
    static String inputColorExtra;
    static String inputRimExtra;
    static String inputCarbonExtra;

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
        System.out.println();
        inputModel = scanner.nextLine();

        switch (inputModel){
            case "Cayenne":
                moneyCounter += 80000;
                System.out.println();
                System.out.println("Current car costs: " + moneyCounter);
                System.out.println();
                chooseExtra();
                break;
            case "Macan":
                moneyCounter += 60000;
                System.out.println();
                System.out.println("Current car costs: " + moneyCounter);
                System.out.println();
                chooseExtra();
                break;
            default:
                System.out.println("Type the exact word");
                chooseSuv();
        }
    }

    public static void chooseLimo(){
        System.out.println("Choose your Model");
        System.out.println("Taycan, Panamera");
        System.out.println();
        inputModel = scanner.nextLine();

        switch (inputModel){
            case "Taycan":
                moneyCounter += 120000;
                System.out.println();
                System.out.println("Current car costs: " + moneyCounter);
                System.out.println();
                chooseExtra();
                break;
            case "Panamera":
                moneyCounter += 130000;
                System.out.println();
                System.out.println("Current car costs: " + moneyCounter);
                System.out.println();
                chooseExtra();
                break;
            default:
                System.out.println("Type the exact word");
                chooseLimo();
        }
    }

    public static void chooseCoupe(){
        System.out.println("Choose your Model");
        System.out.println("911 Turbo S, 718 Boxster");
        System.out.println();
        inputModel = scanner.nextLine();

        switch (inputModel){
            case "911 Turbo S":
                moneyCounter += 150000;
                System.out.println();
                System.out.println("Current car costs: " + moneyCounter);
                System.out.println();
                chooseExtra();
                break;
            case "718 Boxster":
                moneyCounter += 80000;
                System.out.println();
                System.out.println("Current car costs: " + moneyCounter);
                System.out.println();
                chooseExtra();
                break;
            default:
                System.out.println("Type the exact word");
                chooseCoupe();
        }
    }

    public static void chooseCabrio(){
        System.out.println("Choose your Model");
        System.out.println("911 Cabrio, 718 Cabrio");
        System.out.println();
        inputModel = scanner.nextLine();

        switch (inputModel){
            case "911 Cabrio":
                moneyCounter += 160000;
                System.out.println();
                System.out.println("Current car costs: " + moneyCounter);
                System.out.println();
                chooseExtra();
                break;
            case "718 Cabrio":
                moneyCounter += 90000;
                System.out.println();
                System.out.println("Current car costs: " + moneyCounter);
                System.out.println();
                chooseExtra();
                break;
            default:
                System.out.println("Type the exact word");
                chooseCabrio();
        }
    }

    public static void chooseExtra(){
        System.out.println("Choose your Extras");
        System.out.println("Color? yes, no");
        boolean colorValidator = true;
        while (colorValidator){
            inputColorExtra = scanner.nextLine();
            if (inputColorExtra.equals("yes")){
                moneyCounter += 5000;
                colorValidator = false;
            } else if (inputColorExtra.equals("no")){
                colorValidator = false;
            } else {
                System.out.println("Type the exact word");
            }
        }
        System.out.println();
        System.out.println("Current car costs: " + moneyCounter);
        System.out.println();

        System.out.println("Choose Rims");
        System.out.println("18(1), 19(2), 20(3)");
        System.out.println("Type number in brackets");
        boolean rimValidator = true;

        while (rimValidator){
            inputRimExtra = scanner.nextLine();
            switch (inputRimExtra) {
                case "1":
                    moneyCounter += 2000;
                    rimValidator = false;
                    break;
                case "2":
                    moneyCounter += 2500;
                    rimValidator = false;
                    break;
                case "3":
                    moneyCounter += 3000;
                    rimValidator = false;
                    break;
                default:
                    System.out.println("Type the exact word");
                    break;
            }
        }
        System.out.println();
        System.out.println("Current car costs: " + moneyCounter);
        System.out.println();

        System.out.println("Carbon Kit? yes. no");
        boolean carbonValidator = true;
        while (carbonValidator){
            inputCarbonExtra= scanner.nextLine();
            if (inputCarbonExtra.equals("yes")){
                moneyCounter += 9000;
                carbonValidator = false;
            } else if (inputColorExtra.equals("no")){
                carbonValidator = false;
            } else {
                System.out.println("Type the exact word");
            }
        }
        System.out.println();
        System.out.println("Current car costs: " + moneyCounter);
        System.out.println();

    }

}