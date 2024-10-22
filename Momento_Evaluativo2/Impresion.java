public class Impresion extends Producto {
    private String tipoImpresion;
    private Foto fotos; // Ahora usamos la clase Foto

    public Impresion(String nombre, int numeroProducto, String tipoImpresion) {
        super(nombre, numeroProducto);
        this.tipoImpresion = tipoImpresion;
        this.fotos = new Foto(); // Inicializamos el ArrayList de fotos
    }

    // Getters y Setters
    public String getTipoImpresion() {
        return tipoImpresion;
    }

    public void setTipoImpresion(String tipoImpresion) {
        this.tipoImpresion = tipoImpresion;
    }

    public void agregarFoto(String fichero) {
        fotos.agregarFichero(fichero);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de impresión: " + tipoImpresion);
        fotos.print();
    }
}

