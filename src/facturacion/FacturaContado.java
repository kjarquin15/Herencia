package facturacion;
/*
 * Clase FacturaContado (Clase Hija)
 * Aquí se aplica herencia extendiendo de Factura.
 * Se sobrescribe el método calcularTotal para aplicar un descuento.
 */
public class FacturaContado extends Factura{
	private double descuento;

    // Constructor usando super para reutilizar el de la clase padre
    public FacturaContado(int numero, Cliente cliente, double total, double descuento) {
        super(numero, cliente, total);
        this.descuento = descuento;
    }

    /*
     * Sobrescritura del método calcularTotal()
     * Se aplica el descuento al total original
     */
    @Override
    public double calcularTotal() {
        double totalFinal = super.calcularTotal() - descuento;

        // Validación para evitar que el total sea negativo
        if (totalFinal < 0) {
            return 0;
        }
        return totalFinal;
    }
}