public abstract class Impresora {
     String modelo;
     String resolucion;

    public Impresora(String modelo, String resolucion) {
        this.modelo = modelo;
        this.resolucion = resolucion;
    }

    public abstract void imprimirDocumento(String documento);
}
