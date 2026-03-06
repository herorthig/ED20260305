package jcolonia.daw2025.tablasmvc;

/**
 * Nucleo de aplicación de consola de texto con menús.
 * Aplicación de texto usando tablas de multiplicar infantiles clásicas.
 * 
 * @author <a href="hernanj.higort@educa.jcyl.es">Hernán José Higuero Ortega</a>
 * @version 1.0 (20260304)
 */
public class ControlTablaMultiplicar {
	
	/**
	 * Formato tipo «printf» para el nombre del archivo de exportación.
	 */
	public static final String FORMATO_RUTA_ARCHIVO_EXPORTACIÓN = "tabla del %02d.txt";
	
	/** Tabla de multiplicar activa. */
	private TablaMultiplicar tabla;
	
	//private VistaMenu menúPrincipal;
	
	public ControlTablaMultiplicar() {
		init(); //no debemos dejar al constructor vacio pero tampoco hacerlo muy enrevesado.
	}
	
	/**
	 * Pide al usuario un número y prepara la primera tabla activa.
	 */
	public void init() {
		cambiarTabla(); //lo llamo desde aqui porque tienen que hacer lo mismo
	}
	
	/**
	 * Gestión del menú principal.
	 * Desde este menú se ejecutan las opciones disponibles a elección del usuario.
	 * A la salida del menú se finaliza el programa.
	 */
	public void buclePrincipal() {
		VistaMenú menú; //tiene una vista porque tiene una interacción con el usuario prolongada.
		int opción;
		
		menú = new VistaMenú("Tablas de multiplicar", OPCIONES_MENÚ_PRINCIPAL);
		
		do {
			menú.mostrarOpciones();
			opción = menú.pedirOpción();
			
			switch(opción) { //desde aquí mando a otro sitio. No quiero más de una linea.
			case 1: // Mostrar tabla
				mostrarTabla();
				break; //para salir al acabar la instrucción
			case 2: // Cambiar tabla
				cambiarTabla();
				break;
			case 3: // Exportar tabla
				exportarTabla();
				break;
			case 0: // Salir
				break;
			default: // Opciones no implementadas
				opciónNoDisponible();
				break;
			}
			
		} while (opción!=0); //sale cuando el usuario devuelva la opción 0.
		
		VistaGeneral.mostrarAviso("FIN");
		
	}
	
	/**
	 * Muestra por pantalla -envía a la salida estándar-
	 * los productos correspondientes a la tabla activa.
	 */
	private void mostrarTabla() {
		
	}
	
	/**
	 * Cambia la tabla activa por otra elegida por el usuario.
	 */
	private void cambiarTabla() {
		int n;
		
		VistaGeneral.pedirNúmero("Introduzca el número para la tabla");
		//estatico, lo llamamos desde la clase, clase en mayusculas y es de tipo void.
		
		tabla = new TablaMultiplicar(n);
		tabla.generarTabla();
	}
	
	/**
	 * Envia a un archivo
	 * los productos correspondientes a la tabla activa.
	 */
	private void exportarTabla() {
		
	}
	
	/**
	 * Muestra un mensaje de aviso indicando que la opción elegida no está disponible.
	 */
	private void opciónNoDisponible() {
		
	}
	
}
