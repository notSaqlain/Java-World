import java.util.ArrayList;

public class Country {
    private ArrayList<Paese> elenco;
    
    public Country(String FileCSV) {
        System.out.println("Country constructor");
        elenco = new ArrayList<>();
    }
}
