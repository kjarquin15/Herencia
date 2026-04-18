package facturacion;
/*
 * Clase Factura (Clase Padre)
 * Aquí se aplica herencia, ya que otras clases heredarán de esta.
 * Contiene atributos comunes y un método que será sobrescrito.
 */
public class Factura {
	 protected int numero;
	    protected Cliente cliente;
	    protected double total;

	    // Constructor de la clase padre
	    public Factura(int numero, Cliente cliente, double total) {
	        this.numero = numero;
	        this.cliente = cliente;
	        this.total = total;
	    }

	    /*
	     * Método calcularTotal()
	     * Este método será sobrescrito en las clases hijas
	     */
	    public double calcularTotal() {
	        return total;
	    }

	    // Método para mostrar información de la factura
	    public void mostrarFactura() {
	        System.out.println("Factura No: " + numero);
	        System.out.println("Cliente: " + cliente.getNombre());
	        System.out.println("NIT: " + cliente.getNit());
	        System.out.println("Total: " + calcularTotal());
	    }
}