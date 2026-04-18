package facturacion;
/*
 * Clase Cliente
 * Esta clase representa al cliente dentro del sistema de facturación.
 * Aquí se aplica encapsulamiento usando atributos privados y métodos getters.
 */

public class Cliente {
	// TODO Auto-generated constructor stub
	
		  private String nombre;
		    private String nit;

		    // Constructor para inicializar los datos del cliente
		    public Cliente(String nombre, String nit) {
		        this.nombre = nombre;
		        this.nit = nit;
		    }

		    // Método getter para obtener el nombre
		    public String getNombre() {
		        return nombre;
		    }

		    // Método getter para obtener el NIT
		    public String getNit() {
		        return nit;
		    }
		}
