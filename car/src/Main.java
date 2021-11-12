import models.Car;
import models.CarModel;
import models.Category;
import models.Extras;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String inputCategory;
    static String inputModel;
    static String inputColorExtra;
    static String inputRimExtra;
    static String inputCarbonExtra;

    static String name = "";
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
        System.out.println("| 5. Über uns                                  |");
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
            case "5":
                chooseAboutus();
                break;

            default:
                System.out.println("Tippe bloss die Zahl ein:");
                chooseCategory();
        }
    }

    public static void chooseAboutus() {
        System.out.println("________________________________________________");
        System.out.println("| Wir sind zwei Lernende, welche die           |");
        System.out.println("| Technische Berufsschule Zürich besuchen.     |");
        System.out.println("| Wir besuchen gerade das Informatikmodul 226a,|");
        System.out.println("| wo wir mehr zur Programmierung mit Java      |");
        System.out.println("| erfahren und erleben dürfen.                 |");
        System.out.println("|______________________________________________|");
        System.out.println("| 1. Zurück zur Hauptseite                     |");
        System.out.println("| 2. Das Programm beenden                      |");
        System.out.println("|______________________________________________|");
        System.out.println("Tippe hier die Zahl ein:");
        inputModel = scanner.nextLine();

        switch (inputModel){
            case "1":
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
                break;
            case "2":
                System.out.println("Dankeschön, dass du unsere Applikation benutzt hast.");
                System.exit(0);
                break;
            default:
                System.out.println("Tippe bloss die Zahl ein");
                chooseAboutus();
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
                name = "Cayenne Turbo";
                System.out.println();
                System.out.println("Der Preis deines Wagens beträgt: " + moneyCounter + ".- CHF");
                System.out.println();
                chooseExtra();
                break;
            case "2":
                moneyCounter += 60000;
                name = "Macan GTS";
                System.out.println();
                System.out.println("Der Preis deines Wagens beträgt: " + moneyCounter + ".- CHF");
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
                System.out.println("Tippe bloss die Zahl ein:");
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
                name = "Taycan Turbo S";
                System.out.println();
                System.out.println("Der Preis deines Wagens beträgt: " + moneyCounter + ".- CHF");
                System.out.println();
                chooseExtra();
                break;
            case "2":
                moneyCounter += 130000;
                name = "Panamera 4S";
                System.out.println();
                System.out.println("Der Preis deines Wagens beträgt: " + moneyCounter + ".- CHF");
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
                System.out.println("Tippe bloss die Zahl ein:");
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
                name = "911 Turbo S";
                System.out.println();
                System.out.println("Der Preis deines Wagens beträgt: " + moneyCounter + ".- CHF");
                System.out.println();
                chooseExtra();
                break;
            case "2":
                moneyCounter += 130000;
                name = "718 Boxster GT4";
                System.out.println();
                System.out.println("Der Preis deines Wagens beträgt: " + moneyCounter + ".- CHF");
                System.out.println();
                chooseExtra();
                break;
            case "3":
                moneyCounter += 1190000;
                name = "918 Spyder Weissach";
                System.out.println();
                System.out.println("Der Preis deines Wagens beträgt: " + moneyCounter + ".- CHF");
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
                System.out.println("Tippe bloss die Zahl ein:");
                chooseCoupe();
        }
    }

    public static void chooseCabrio(){
        System.out.println();
        System.out.println("_______________________________________________");
        System.out.println("| Die Cabrio-Modelle die zur Verfügung wären: |");
        System.out.println("| 1. 911 Exklusiv Cabrio  (150'000.-)         |");
        System.out.println("| 2. 911 Targa 4S         (140'000.-)         |");
        System.out.println("| 3. 718 Bergspyder       (290'000.-)         |");
        System.out.println("|_____________________________________________|");
        System.out.println("| 4. Falls du zurück zur Kategorie möchtest   |");
        System.out.println("|_____________________________________________|");
        System.out.println("Tippe hier die Zahl ein:");
        inputModel = scanner.nextLine();

        switch (inputModel){
            case "1":
                moneyCounter += 150000;
                name = "911 Exklusiv Cabrio";
                System.out.println();
                System.out.println("Der Preis deines Wagens beträgt: " + moneyCounter + ".- CHF");
                System.out.println();
                chooseExtra();
                break;
            case "2":
                moneyCounter += 140000;
                name = "911 Targa 4S";
                System.out.println();
                System.out.println("Der Preis deines Wagens beträgt: " + moneyCounter + ".- CHF");
                System.out.println();
                chooseExtra();
                break;
            case "3":
                moneyCounter += 290000;
                name = "718 Bergspyder";
                System.out.println();
                System.out.println("Der Preis deines Wagens beträgt: " + moneyCounter + ".- CHF");
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
                System.out.println("Tippe bloss die Zahl ein:");
                chooseCabrio();
        }
    }

    public static void chooseExtra(){
        System.out.println();
        System.out.println("________________________________________________");
        System.out.println("| Hier werden deine Extras fürs Auto gewählt.  |");
        System.out.println("|______________________________________________|");
        System.out.println("| Möchtest du ein Carbon Kit                   |");
        System.out.println("| 1. Ja         (+13'000.-)                    |");
        System.out.println("| 2. Nein                                      |");
        System.out.println("|______________________________________________|");
        System.out.println("Tippe hier die Zahl ein:");
        boolean carbonValidator = true;

        String carbon = null;
        while (carbonValidator){
            inputCarbonExtra= scanner.nextLine();
            if (inputCarbonExtra.equals("1")){
                moneyCounter += 13000;
                carbon = "Carbon Paket";
                carbonValidator = false;
            } else if (inputColorExtra.equals("2")){
                carbon = "Kein Carbon Paket";
                carbonValidator = false;
            } else {
                System.out.println("Tippe bloss die Zahl ein:");
            }
        }
        System.out.println();
        System.out.println("Der Preis deines Wagens beträgt: " + moneyCounter + ".- CHF");
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

        String rim = null;
        while (rimValidator){
            inputRimExtra = scanner.nextLine();
            switch (inputRimExtra) {
                case "1":
                    moneyCounter += 6000;
                    rim = "18 Zoll Felgen";
                    rimValidator = false;
                    break;
                case "2":
                    moneyCounter += 8500;
                    rim = "19 Zoll Felgen";
                    rimValidator = false;
                    break;
                case "3":
                    moneyCounter += 9000;
                    rim = "20 Zoll Felgen";
                    rimValidator = false;
                    break;
                case "4":
                    moneyCounter += 10000;
                    rim = "21 Zoll Felgen";
                    rimValidator = false;
                    break;
                default:
                    System.out.println("Tippe bloss die Zahl ein:");
                    break;
            }
        }
        System.out.println();
        System.out.println("Der Preis deines Wagens beträgt: " + moneyCounter + ".- CHF");
        System.out.println();


        System.out.println();
        System.out.println("Der Preis deines Wagens beträgt: " + moneyCounter + ".- CHF");
        System.out.println();
        System.out.println("|______________________________________________|");
        System.out.println("| Deine standard Farbe ist bereits Schwarz.    |");
        System.out.println("| Hier ansonsten die Liste für eine Änderung.  |");
        System.out.println("| 1. Weiss                    (+2'500.-)       |");
        System.out.println("| 2. Kastanienbraun           (+8'000.-)       |");
        System.out.println("| 3. Petrolblau               (+9'000.-)       |");
        System.out.println("| 4. Lavaorangenrot           (+9'000.-)       |");
        System.out.println("| 5. Schwarz                  (+0)             |");
        System.out.println("|______________________________________________|");
        System.out.println("Tippe hier die Zahl ein:");
        boolean colorValidator = true;

        String color = null;
        while (colorValidator){
            inputColorExtra = scanner.nextLine();
            switch (inputColorExtra) {
                case "1":
                    moneyCounter += 6000;
                    color = "Weiss";
                    colorValidator = false;
                    break;
                case "2":
                    moneyCounter += 8500;
                    color = "Kastanienbraun";
                    colorValidator = false;
                    break;
                case "3":
                    moneyCounter += 9000;
                    color = "Petrolblau";
                    colorValidator = false;
                    break;
                case "4":
                    moneyCounter += 10000;
                    color = "Lavaorangenrot";
                    colorValidator = false;
                    break;
                case "5":
                    moneyCounter += 0;
                    color = "Schwarz";
                    colorValidator = false;
                    break;
                default:
                    System.out.println("Tippe bloss die Zahl ein");
                    break;
            }
        }
        System.out.println();

        Extras extras = new Extras(carbon, rim, color);
        CarModel carModel = new CarModel(name, extras);
        Category category = new Category(name, carModel);
        Car car = new Car(category, carModel, extras, moneyCounter);

        System.out.println();

        System.out.println("_________________________________________________________");
        System.out.println("| Du hast das Modell: "+ car.carModel.getName() + " bestellt.");
        System.out.println("| Folgende Extras hast du für dein Auto hinzugefügt          ");
        System.out.println("| Farbe: " + car.extras.getColor() + "                       ");
        System.out.println("| Kohlefaser: " + car.extras.isCarbon() + "                  ");
        System.out.println("| Felgen: " + car.extras.getRims() + "                       ");
        System.out.println("| Der Preis deines Fahrzeugs beträgt: " + car.price + ".- CHF  ");
        System.out.println("|_______________________________________________________|");
        System.out.println("| Die Applikation wäre hier zu Ende, jedoch hast du die |");
        System.out.println("| Wahl wie es weiter gehen soll:                        |");
        System.out.println("| 1. Du kehrst zurück zum Hauptmenü                     |");
        System.out.println("| 2. Du beendest das Programm                           |");
        System.out.println("| 3. Du bezahlst die Auto kosten an uns                 |");
        System.out.println("|_______________________________________________________|");
        System.out.println("Tippe hier die Zahl ein:");
        inputModel = scanner.nextLine();

        switch (inputModel){
            case "1":
                System.out.println("Hallo Benutzer, viel Spass beim Modifizieren deines Fahrzeuges");
                System.out.println();
                System.out.println("________________________________________________");
                System.out.println("| Wähle die Kategorie deines Auto aus          |");
                System.out.println("| 1. SUV                                       |");
                System.out.println("| 2. Limo                                      |");
                System.out.println("| 3. Coupé                                     |");
                System.out.println("| 4. Cabrio                                    |");
                System.out.println("|______________________________________________|");
                System.out.println("| 5. Über uns                                  |");
                System.out.println("|______________________________________________|");
                System.out.println("Tippe hier die Zahl ein:");
                chooseCategory();
                break;
            case "2":
                System.out.println("     ______       ");
                System.out.println("  __/______\\_____ ");
                System.out.println(" |-0-------0----|");
                System.exit(0);
                break;
            case "3":
                System.out.println();
                System.out.println();
                System.out.println("Du kannst deine Anzahlung an unsere IBAN schicken: CH48 0483 5137 1495 4000 0");
                System.out.println("Vielen Dank :)");
                System.out.println();
                System.out.println("     ______       ");
                System.out.println("  __/______\\_____ ");
                System.out.println(" |-0-------0----|");
                System.exit(0);
                break;
            default:
                System.out.println("Durch deinen Fehlertippen, schliesst sich diese Applikation.");
                System.exit(0);
        }
    }

}



