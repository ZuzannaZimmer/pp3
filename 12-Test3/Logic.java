import java.util.*;

public class Logic {
    private boolean[] ciag;

    public Logic(boolean[] ciag) {
        this.ciag = ciag;
    }

    public int opposite() {
        ArrayList<Boolean> lista = new ArrayList<>();
        for (int i = 0; i < ciag.length; i++) {
            lista.add(ciag[i]);
        }
        int suma = 0;
        for (int j = 1; j < lista.size() - 1; j++) {
            if (lista.get(j - 1) != lista.get(j) && lista.get(j + 1) != lista.get(j)) {
                suma = suma + 1;
            }
        }
        return suma;
    }

}
