import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Country {
    private ArrayList<Paese> elenco;

    private void LoadFile(String FileCSV) {
        File dati = new File("./data/paesi.csv");
        try {
            Scanner sc = new Scanner(dati);
            while (sc.hasNextLine()) {
                String riga = sc.nextLine();
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public Country(String FileCSV) {
        System.out.println("Country constructor");
        elenco = new ArrayList<>();
    }
}
