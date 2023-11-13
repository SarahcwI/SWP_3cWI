package at.sarah.StringHelper;

public class Main {
    public static void main(String[] args) {
        String wordInput = "anna";
        boolean isPalidrom = StringHelper.isPalidrom(wordInput);

        if (isPalidrom){
            System.out.println("Es funktioniert juppi");
        }
        if (!isPalidrom){
            System.out.println("Nein es funktiniert nicht");
        }

    }
}
