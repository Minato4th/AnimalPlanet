import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static Initializer initializer = new Initializer();

    static Whiskas whiskas = new Whiskas();
    static Chappi chappi = new Chappi();
    static Eagle eagle = new Eagle();
    static Chupacabra chupacabra = new Chupacabra();

    public static void main(String[] args) {

        System.out.println("Please chose animal");
        choise();
        take();

    }

    public static void choise(){
        System.out.println();
        System.out.println("1. Cat");
        System.out.println("2. Dog");
        System.out.println("3. Bird");
        System.out.println("4. Alien Animal");
        System.out.println("5. Exit");
    }

    public static void take(){
        String dell = "";
        boolean done = false;

        try {
            dell = reader.readLine();
            for (int i = 0; i < dell.length(); i++) {
                if (!Character.isDigit(dell.charAt(i))){
                    System.out.println("Wrong, Think what you are typing");
                    done = false;
                    break;
                }
                done = true;
            }


        } catch (IOException e) {
            System.out.println("Wrong, Think what you are typing");
            choise();
            take();
        }

        if (done) {
            if (Integer.parseInt(dell) == 1){
                initializer.callAll(whiskas);
                choise();
                take();
            }else if (Integer.parseInt(dell) == 2){
                initializer.callAll(chappi);
                choise();
                take();
            }else if (Integer.parseInt(dell) == 3){
                initializer.callAll(eagle);
                choise();
                take();
            }else if (Integer.parseInt(dell) == 4){
                initializer.callAll(chupacabra);
                choise();
                take();
            }else if (Integer.parseInt(dell) == 5){
                System.out.println("Done!");
            }else {
                System.out.println("ohhh wrong baby!");
                choise();
                take();
            }
        }
        else {
            choise();
            take();
        }
    }

}
