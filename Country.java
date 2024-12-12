import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Country {
    private ArrayList<Paese> elenco;

    private void LoadFile(String FileCSV) {
        File dati = new File(FileCSV);
        try {
            Scanner sc = new Scanner(dati);
            while (sc.hasNextLine()) {
                String riga = sc.nextLine();
                String fld[] = riga.split(",");
                if (fld.length != 5) {
                    System.out.println("Errore: riga non conforme");
                    continue;
                }
                Paese p = new Paese(fld[0], fld[1], fld[2]);
                elenco.add(p);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public Country(String FileCSV) {
        elenco = new ArrayList<>();
        LoadFile(FileCSV);
    }

    @Override
    public String toString() {
        String s = "";
        for (Paese p : elenco) {
            s += p.toString() + "\n";
        }
        return s;
    }

    
}
