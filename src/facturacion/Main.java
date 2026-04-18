package facturacion;

/*
 * Clase principal (Main)
 * Aquí se realizan pruebas del sistema de facturación.
 * Se crean objetos y se verifica el funcionamiento de la herencia,
 * sobrescritura de métodos y validaciones.
 */
public class Main {
	 public static void main(String[] args) {

	        // Caso de prueba 1: Factura al contado con descuento
	        Cliente cliente1 = new Cliente("Juan Perez", "1234567-8");
	        FacturaContado fc = new FacturaContado(1, cliente1, 500, 50);

	        System.out.println("=== FACTURA CONTADO ===");
	        fc.mostrarFactura();

	        // Caso de prueba 2: Factura a crédito con recargo y cuotas
	        Cliente cliente2 = new Cliente("Maria Lopez", "9876543-2");
	        FacturaCredito fcr = new FacturaCredito(2, cliente2, 800, 100, 4);

	        System.out.println("\n=== FACTURA CREDITO ===");
	        fcr.mostrarFactura();
	        fcr.mostrarCuotas();

	        // Caso de prueba 3: Validación cuando el total es negativo
	        FacturaContado fcNegativa = new FacturaContado(3, cliente1, 40, 100);

	        System.out.println("\n=== FACTURA NEGATIVA ===");
	        fcNegativa.mostrarFactura();
	    }
	}