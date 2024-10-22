import java.util.ArrayList;

public class Foto {
    private ArrayList<String> ficheros;

    public Foto() {
        ficheros = new ArrayList<>();
    }

    public void agregarFichero(String fichero) {
        ficheros.add(fichero);
    }

    public ArrayList<String> getFicheros() {
        return ficheros;
    }

    public void print() {
        for (String fichero : ficheros) {
            System.out.println("Imprimiendo foto desde " + fichero);
        }
    }
}
