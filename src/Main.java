import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Waitingline waitingline = new Waitingline();
        Scanner scanner = new Scanner(System.in);
        waitingline.start();

        int choice;
        do{
            System.out.println("\n 1 - Auto hinzufügen\n 2 - Auto aus Warteschlage entfernen \n 0 - Beenden\n");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Kennzeichen eingeben: ");
                    String licenceplate = scanner.next();
                    waitingline.addCarToWaitingList(licenceplate);
                    break;
                case 2:
                    waitingline.removeCarFromWaitingLine();
                case 0:
                    System.out.println("Programm wird beendet.");
                    break;
                default:
                    System.out.println("Ungültige Eingabe.");
            }
        }while(choice != 0);
    }
}
