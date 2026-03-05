package jcolonia.daw2025.ejemplosut5;

/**
 * Lanzador de aplicación de consola de texto con menús.
 * Aplicación de texto usando tablas de multiplicar infantiles clásicas.
 * 
 * @author <a href="hernanj.higort@educa.jcyl.es">Hernán José Higuero Ortega</a>
 * @version 1.0 (20260304)
 */
public class LanzadorTablaMultiplicar {
	
	/**
	 * Inicia el menú principal del programa.
	 * @param argumentos opciones de ejecución -no se usan-
	 */
	public static void main(String[] argumentos) {
		ControlTablaMultiplicar programa;
		
		programa = new ControlTablaMultiplicar();
		
		programa.buclePrincipal();
	}
	
}
