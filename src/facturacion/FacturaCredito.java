package facturacion;
/*
 * Clase FacturaCredito (Clase Hija)
 * Hereda de Factura y agrega recargo y cuotas.
 * Se sobrescribe el método calcularTotal para sumar el recargo.
 */
public class FacturaCredito extends Factura {
	  private double recargo;
	    private int cuotas;

	    // Uso de super para llamar al constructor de la clase padre
	    public FacturaCredito(int numero, Cliente cliente, double total, double recargo, int cuotas) {
	        super(numero, cliente, total);
	        this.recargo = recargo;
	        this.cuotas = cuotas;
	    }

	    /*
	     * Sobrescritura del método calcularTotal()
	     * Se agrega un recargo al total original
	     */
	    @Override
	    public double calcularTotal() {
	        double totalFinal = super.calcularTotal() + recargo;

	        // Validación para evitar valores negativos
	        if (totalFinal < 0) {
	            return 0;
	        }
	        return totalFinal;
	    }

	    // Método adicional para mostrar información de las cuotas
	    public void mostrarCuotas() {
	        System.out.println("Cuotas: " + cuotas);
	        System.out.println("Pago por cuota: " + (calcularTotal() / cuotas));
	    }
	}
