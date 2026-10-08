//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ImpresoraLaser laser = new ImpresoraLaser(
            "HP LaserJet",
            "1200 dpi",
            50
    );

    ImpresoraTinta tinta = new ImpresoraTinta(
            "Epson EcoTank",
            "600 dpi",
            50
    );

    laser.imprimirDocumento("Informe de ventas");
    tinta.imprimirDocumento("Trabajo practico");

    System.out.println();

    System.out.println("Estado de la impresora laser:");
    laser.mostrarEstado();

    System.out.println();

    System.out.println("Estado de la impresora de tinta:");
    tinta.mostrarEstado();
}
