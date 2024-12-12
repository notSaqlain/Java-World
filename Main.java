import java.io.File;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Paese p1 = new Paese("Italia", "Europa", "60");
        System.out.println(p1);

        Country c1 = new Country("./data/paesi.csv");
        System.out.println(c1);
    }
}