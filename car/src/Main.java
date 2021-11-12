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
        System.out.println("________________________________________________");
        System.out.println("| Wähle die Kategorie deines Auto aus          |");
        System.out.println("| 1. SUV                                       |");
        System.out.println("| 2. Limo                                      |");
        System.out.println("| 3. Coupé                                     |");
        System.out.println("| 4. Cabrio                                    |");
        System.out.println("|______________________________________________|");
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
                System.out.println("Tippe bloss die Zahl ein");
                chooseCategory();
        }
    }

    public static void chooseSuv(){
        System.out.println();
        System.out.println("_______________________________________________");
        System.out.println("| Die SUV-Modelle die zur Verfügung wären:    |");
        System.out.println("| 1. Cayenne Turbo (80'000.-)                 |");
        System.out.println("| 2. Macan GTS     (60'000.-)                 |");
        System.out.println("|_____________________________________________|");
        System.out.println("| 3. Falls du zurück zur Kategorie möchtest   |");
        System.out.println("|_____________________________________________|");
        System.out.println("Tippe hier die Zahl ein:");
        inputModel = scanner.nextLine();


        switch (inputModel){
            case "1":
                moneyCounter += 80000;
                System.out.println();
                System.out.println("Der Preis deines Wagens beträgt: " + moneyCounter);
                System.out.println();
                chooseExtra();
                break;
            case "2":
                moneyCounter += 60000;
                System.out.println();
                System.out.println("Der Preis deines Wagens beträgt: " + moneyCounter);
                System.out.println();
                chooseExtra();
                break;
            case "3":
                System.out.println();
                System.out.println("________________________________________________");
                System.out.println("| Wähle die Kategorie deines Auto aus          |");
                System.out.println("| 1. SUV                                       |");
                System.out.println("| 2. Limo                                      |");
                System.out.println("| 3. Coupé                                     |");
                System.out.println("| 4. Cabrio                                    |");
                System.out.println("|______________________________________________|");
                System.out.println("Tippe hier die Zahl ein:");
                chooseCategory();
            default:
                System.out.println("Tippe bloss die Zahl ein");
                chooseSuv();
        }
    }

    public static void chooseLimo(){
        System.out.println();
        System.out.println("_______________________________________________");
        System.out.println("| Die Limo-Modelle die zur Verfügung wären:   |");
        System.out.println("| 1. Taycan Turbo S (120'000.-)               |");
        System.out.println("| 2. Panamera 4S    (130'000.-)               |");
        System.out.println("|_____________________________________________|");
        System.out.println("| 3. Falls du zurück zur Kategorie möchtest   |");
        System.out.println("|_____________________________________________|");
        System.out.println("Tippe hier die Zahl ein:");
        inputModel = scanner.nextLine();

        switch (inputModel){
            case "1":
                moneyCounter += 120000;
                System.out.println();
                System.out.println("Der Preis deines Wagens beträgt: " + moneyCounter);
                System.out.println();
                chooseExtra();
                break;
            case "2":
                moneyCounter += 130000;
                System.out.println();
                System.out.println("Der Preis deines Wagens beträgt: " + moneyCounter);
                System.out.println();
                chooseExtra();
                break;
            case "3":
                System.out.println();
                System.out.println("________________________________________________");
                System.out.println("| Wähle die Kategorie deines Auto aus          |");
                System.out.println("| 1. SUV                                       |");
                System.out.println("| 2. Limo                                      |");
                System.out.println("| 3. Coupé                                     |");
                System.out.println("| 4. Cabrio                                    |");
                System.out.println("|______________________________________________|");
                System.out.println("Tippe hier die Zahl ein:");
                chooseCategory();
            default:
                System.out.println("Tippe bloss die Zahl ein");
                chooseLimo();
        }
    }

    public static void chooseCoupe(){
        System.out.println();
        System.out.println("_______________________________________________");
        System.out.println("| Die Coupé-Modelle die zur Verfügung wären:  |");
        System.out.println("| 1. 911 Turbo S          (170'000.-)         |");
        System.out.println("| 2. 718 Boxster GT4      (130'000.-)         |");
        System.out.println("| 3. 918 Spyder Weissach  (1'190'000.-)       |");
        System.out.println("|_____________________________________________|");
        System.out.println("| 4. Falls du zurück zur Kategorie möchtest   |");
        System.out.println("|_____________________________________________|");
        System.out.println("Tippe hier die Zahl ein:");
        inputModel = scanner.nextLine();

        switch (inputModel){
            case "1":
                moneyCounter += 170000;
                System.out.println();
                System.out.println("Der Preis deines Wagens beträgt: " + moneyCounter);
                System.out.println();
                chooseExtra();
                break;
            case "2":
                moneyCounter += 130000;
                System.out.println();
                System.out.println("Der Preis deines Wagens beträgt: " + moneyCounter);
                System.out.println();
                chooseExtra();
                break;
            case "3":
                moneyCounter += 1190000;
                System.out.println();
                System.out.println("Der Preis deines Wagens beträgt: " + moneyCounter);
                System.out.println();
                chooseExtra();
                break;
            case "4":
                System.out.println();
                System.out.println("________________________________________________");
                System.out.println("| Wähle die Kategorie deines Auto aus          |");
                System.out.println("| 1. SUV                                       |");
                System.out.println("| 2. Limo                                      |");
                System.out.println("| 3. Coupé                                     |");
                System.out.println("| 4. Cabrio                                    |");
                System.out.println("|______________________________________________|");
                System.out.println("Tippe hier die Zahl ein:");
                chooseCategory();
            default:
                System.out.println("Tippe bloss die Zahl ein");
                chooseCoupe();
        }
    }

    public static void chooseCabrio(){
        System.out.println();
        System.out.println("_______________________________________________");
        System.out.println("| Die Cabrio-Modelle die zur Verfügung wären: |");
        System.out.println("| 1. 911 Exklusiv Cabrio  (150'000.-)         |");
        System.out.println("| 2. 911 Targa GTS        (140'000.-)         |");
        System.out.println("| 3. 718 Bergspyder       (290'000.-)         |");
        System.out.println("|_____________________________________________|");
        System.out.println("| 4. Falls du zurück zur Kategorie möchtest   |");
        System.out.println("|_____________________________________________|");
        System.out.println("Tippe hier die Zahl ein:");
        inputModel = scanner.nextLine();

        switch (inputModel){
            case "1":
                moneyCounter += 150000;
                System.out.println();
                System.out.println("Der Preis deines Wagens beträgt: " + moneyCounter);
                System.out.println();
                chooseExtra();
                break;
            case "2":
                moneyCounter += 140000;
                System.out.println();
                System.out.println("Der Preis deines Wagens beträgt: " + moneyCounter);
                System.out.println();
                chooseExtra();
                break;
            case "3":
                moneyCounter += 290000;
                System.out.println();
                System.out.println("Der Preis deines Wagens beträgt: " + moneyCounter);
                System.out.println();
                chooseExtra();
                break;
            case "4":
                System.out.println();
                System.out.println("_______________________________________________");
                System.out.println("| Wähle die Kategorie deines Auto aus          |");
                System.out.println("| 1. SUV                                       |");
                System.out.println("| 2. Limo                                      |");
                System.out.println("| 3. Coupé                                     |");
                System.out.println("| 4. Cabrio                                    |");
                System.out.println("|______________________________________________|");
                System.out.println("Tippe hier die Zahl ein:");
                chooseCategory();
            default:
                System.out.println("Tippe bloss die Zahl ein");
                chooseCabrio();
        }
    }

    public static void chooseExtra(){
        System.out.println();
        System.out.println("_______________________________________________");
        System.out.println("| Hier werden deine Extras fürs Auto gewählt.  |");
        System.out.println("|______________________________________________|");
        System.out.println("| Möchtest du ein Carbon Kit                   |");
        System.out.println("| 1. Ja         (+13'000.-)                    |");
        System.out.println("| 2. Nein                                      |");
        System.out.println("|______________________________________________|");
        System.out.println("Tippe hier die Zahl ein:");
        boolean carbonValidator = true;
        while (carbonValidator){
            inputCarbonExtra= scanner.nextLine();
            if (inputCarbonExtra.equals("1")){
                moneyCounter += 13000;
                carbonValidator = false;
            } else if (inputColorExtra.equals("2")){
                carbonValidator = false;
            } else {
                System.out.println("Tippe bloss die Zahl ein");
            }
        }
        System.out.println();
        System.out.println("Der Preis deines Wagens beträgt: " + moneyCounter);
        System.out.println();
        System.out.println("|______________________________________________|");
        System.out.println("| Wie gross sollen deine Felgen sein?          |");
        System.out.println("| 1. 18 Zoll Felgen    (+6'000.-)              |");
        System.out.println("| 2. 19 Zoll Felgen    (+8'000.-)              |");
        System.out.println("| 3. 20 Zoll Felgen    (+9'000.-)              |");
        System.out.println("| 4. 21 Zoll Felgen    (+10'000.-)             |");
        System.out.println("|______________________________________________|");
        System.out.println("Tippe hier die Zahl ein:");
        boolean rimValidator = true;

        while (rimValidator){
            inputRimExtra = scanner.nextLine();
            switch (inputRimExtra) {
                case "1":
                    moneyCounter += 6000;
                    rimValidator = false;
                    break;
                case "2":
                    moneyCounter += 8500;
                    rimValidator = false;
                    break;
                case "3":
                    moneyCounter += 9000;
                    rimValidator = false;
                    break;
                case "4":
                    moneyCounter += 10000;
                    rimValidator = false;
                    break;
                default:
                    System.out.println("Tippe bloss die Zahl ein");
                    break;
            }
        }
        System.out.println();
        System.out.println("Der Preis deines Wagens beträgt: " + moneyCounter);
        System.out.println();


        System.out.println();
        System.out.println("Der Preis deines Wagens beträgt: " + moneyCounter);
        System.out.println();
        System.out.println("|______________________________________________|");
        System.out.println("| Deine standard Farbe ist bereits Schwarz.    |");
        System.out.println("| Hier ansonsten die Liste für eine Änderung.  |");
        System.out.println("| 1. Weiss                    (+2'500.-)       |");
        System.out.println("| 2. Kastanienbraun           (+8'000.-)       |");
        System.out.println("| 3. Petrolblau mit Grünstich (+9'000.-)       |");
        System.out.println("| 4. Lavaorangenrot           (+9'000.-)      |");
        System.out.println("|______________________________________________|");
        System.out.println("Tippe hier die Zahl ein:");
        boolean colorValidator = true;

        while (colorValidator){
            inputColorExtra = scanner.nextLine();
            switch (inputColorExtra) {
                case "1":
                    moneyCounter += 6000;
                    colorValidator = false;
                    break;
                case "2":
                    moneyCounter += 8500;
                    colorValidator = false;
                    break;
                case "3":
                    moneyCounter += 9000;
                    colorValidator = false;
                    break;
                case "4":
                    moneyCounter += 10000;
                    colorValidator = false;
                    break;
                default:
                    System.out.println("Tippe bloss die Zahl ein");
                    break;
            }
        }
        System.out.println();
        System.out.println("Der Preis deines Wagens beträgt: " + moneyCounter);
        System.out.println();

    }

}