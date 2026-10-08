public class ImpresoraTinta  {
    String modelo;
    String resolucion;
     int nivelCartucho;

    public ImpresoraTinta(String modelo, String resolucion, int nivelCartucho) {
        this.modelo = modelo;
        this.resolucion = resolucion;
        this.nivelCartucho = nivelCartucho;
    }

    public void imprimirDocumento(String documento) {

        if (nivelCartucho > 0) {
            System.out.println("Imprimiendo documento: " + documento);
            nivelCartucho = nivelCartucho - 10;
        } else {
            System.out.println("No se puede imprimir. Cartucho agotado.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Resolucion: " + resolucion);
        System.out.println("Nivel de cartucho: " + nivelCartucho);
    }
}
