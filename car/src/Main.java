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
        System.out.println();
        System.out.println("Hallo Benutzer, viel Spass beim Modifizieren deines Fahrzeuges");
        System.out.println();
        System.out.println("______________________________________________");
        System.out.println("| Wähle die Kategorie deines Auto aus         |");
        System.out.println("| 1. Suv                                      |");
        System.out.println("| 2. Limo                                     |");
        System.out.println("| 3. Coupe                                    |");
        System.out.println("| 4. Cabrio                                   |");
        System.out.println("|_____________________________________________|");
        System.out.println("Tippe hier die Zahl ein:");
        chooseCategory();
    }

    public static void chooseCategory(){
        inputCategory = scanner.nextLine();

        switch (inputCategory){
            case "1":
                chooseSuv();
                break;
            case "2":
                chooseLimo();
                break;
            case "3":
                chooseCoupe();
                break;
            case "4":
                chooseCabrio();
                break;
            default:
                System.out.println("Tippe bloss die richtige Zahlen ein");
                chooseCategory();
        }
    }

    public static void chooseSuv(){
        System.out.println();
        System.out.println("______________________________________________");
        System.out.println("| Die SUV-Modelle die zur Verfügung wären:   |");
        System.out.println("| 1. Cayenne Turbo (80'000.-)                |");
        System.out.println("| 2. Macan GTS     (60'000.-)                |");
        System.out.println("|____________________________________________|");
        System.out.println("| 3. Falls du zurück zur Kategorie möchtest  |");
        System.out.println("|____________________________________________|");
        System.out.println("Tippe hier die Zahl ein:");
        inputModel = scanner.nextLine();


        switch (inputModel){
            case "1":
                moneyCounter += 80000;
                System.out.println();
                System.out.println("Dein Wagen Preis beträgt gerade: " + moneyCounter);
                System.out.println();
                chooseExtra();
                break;
            case "2":
                moneyCounter += 60000;
                System.out.println();
                System.out.println("Dein Wagen Preis beträgt gerade: " + moneyCounter);
                System.out.println();
                chooseExtra();
                break;
            case "3":
                System.out.println();
                System.out.println("______________________________________________");
                System.out.println("| Wähle die Kategorie deines Auto aus         |");
                System.out.println("| 1. Suv                                      |");
                System.out.println("| 2. Limo                                     |");
                System.out.println("| 3. Coupe                                    |");
                System.out.println("| 4. Cabrio                                   |");
                System.out.println("|_____________________________________________|");
                System.out.println("Tippe hier die Zahl ein:");
                chooseCategory();
            default:
                System.out.println("Type the exact word");
                chooseSuv();
        }
    }

    public static void chooseLimo(){
        System.out.println();
        System.out.println("______________________________________________");
        System.out.println("| Die Limo-Modelle die zur Verfügung wären:  |");
        System.out.println("| 1. Taycan Turbo S (120'000.-)              |");
        System.out.println("| 2. Panamera 4S    (130'000.-)              |");
        System.out.println("|____________________________________________|");
        System.out.println("| 3. Falls du zurück zur Kategorie möchtest  |");
        System.out.println("|____________________________________________|");
        System.out.println("Tippe hier die Zahl ein:");
        inputModel = scanner.nextLine();

        switch (inputModel){
            case "1":
                moneyCounter += 120000;
                System.out.println();
                System.out.println("Dein Wagen Preis beträgt gerade: " + moneyCounter);
                System.out.println();
                chooseExtra();
                break;
            case "2":
                moneyCounter += 130000;
                System.out.println();
                System.out.println("Dein Wagen Preis beträgt gerade: " + moneyCounter);
                System.out.println();
                chooseExtra();
                break;
            case "3":
                System.out.println();
                System.out.println("______________________________________________");
                System.out.println("| Wähle die Kategorie deines Auto aus         |");
                System.out.println("| 1. Suv                                      |");
                System.out.println("| 2. Limo                                     |");
                System.out.println("| 3. Coupe                                    |");
                System.out.println("| 4. Cabrio                                   |");
                System.out.println("|_____________________________________________|");
                System.out.println("Tippe hier die Zahl ein:");
                chooseCategory();
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
                System.out.println("Dein Wagen Preis beträgt gerade: " + moneyCounter);
                System.out.println();
                chooseExtra();
                break;
            case "718 Boxster":
                moneyCounter += 80000;
                System.out.println();
                System.out.println("Dein Wagen Preis beträgt gerade: " + moneyCounter);
                System.out.println();
                chooseExtra();
                break;
            case "3":
                System.out.println();
                System.out.println("______________________________________________");
                System.out.println("| Wähle die Kategorie deines Auto aus         |");
                System.out.println("| 1. Suv                                      |");
                System.out.println("| 2. Limo                                     |");
                System.out.println("| 3. Coupe                                    |");
                System.out.println("| 4. Cabrio                                   |");
                System.out.println("|_____________________________________________|");
                System.out.println("Tippe hier die Zahl ein:");
                chooseCategory();
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
                System.out.println("Dein Wagen Preis beträgt gerade: " + moneyCounter);
                System.out.println();
                chooseExtra();
                break;
            case "718 Cabrio":
                moneyCounter += 90000;
                System.out.println();
                System.out.println("Dein Wagen Preis beträgt gerade: " + moneyCounter);
                System.out.println();
                chooseExtra();
                break;
            case "3":
                System.out.println();
                System.out.println("______________________________________________");
                System.out.println("| Wähle die Kategorie deines Auto aus         |");
                System.out.println("| 1. Suv                                      |");
                System.out.println("| 2. Limo                                     |");
                System.out.println("| 3. Coupe                                    |");
                System.out.println("| 4. Cabrio                                   |");
                System.out.println("|_____________________________________________|");
                System.out.println("Tippe hier die Zahl ein:");
                chooseCategory();
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