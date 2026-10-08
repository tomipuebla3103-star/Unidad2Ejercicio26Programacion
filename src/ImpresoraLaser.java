public class ImpresoraLaser {
    String modelo;
    private String resolucion;
    private int nivelToner;

    public ImpresoraLaser(String modelo, String resolucion, int nivelToner) {
        this.modelo = modelo;
        this.resolucion = resolucion;
        this.nivelToner = nivelToner;
    }

    public void imprimirDocumento(String documento) {

        if (nivelToner > 0) {
            System.out.println("Imprimiendo documento: " + documento);
            nivelToner = nivelToner - 10;
        } else {
            System.out.println("No se puede imprimir. Toner agotado.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Resolucion: " + resolucion);
        System.out.println("Nivel de toner: " + nivelToner);
    }
}
