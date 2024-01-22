import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Hello World
//Hello World
//Hello World
//Hello World
//Hello World
//Hello World
//Hello World
//Hello World
//Hello Wo


public class Waitingline extends Thread{
    List<String> waitingLine = new ArrayList<>();

    public void run() {
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            System.out.println("FEHLER: " + e);
        }
        if (!waitingLine.isEmpty()) {
            System.out.println("\n- - - " + waitingLine.get(0) + " ist fertig - - - ");
            waitingLine.remove(0);
            run();
        } else {
            System.out.println("Kein Auto in der Warteschlange.");
        }
    }

    public void addCarToWaitingList(String auto){
        if(waitingLine.size() < 10){
            waitingLine.add(auto);
            System.out.println("Auto wurde hinzugefügt.");
        }
        else{
            System.out.println("Auto konnte nicht hinzugefügt werden. Maximale Anzahl an Autos bereits erreicht.");
        }
    }

    public void removeCarFromWaitingLine(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welches Auto soll entfernt werden? ");
        int carindex = scanner.nextInt();
        if(carindex > waitingLine.size() && carindex != 0){
            System.out.println("Dieses Auto existiert nicht.");
        }
        else{
            System.out.println("\n- - - " + waitingLine.get(carindex) + " wurde entfernt - - -");
            waitingLine.remove(carindex);
        }
    }
}
