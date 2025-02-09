package controladores;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jmormez
 * @date 08/02/2025
 * Puerta de entrada a mi aplicación
 */
public class Inicio {

	
	/**
	 * @author jmormez
	 * @date 09/02/2025
	 * @param parametros de configuración
	 * Clase controladora de mi proyecto
	 */
	public static void main(String[] args) {
		boolean agregado;
		 // Crear un conjunto
        Set<Integer> numeros = new HashSet<>();

        // Agregar valores al conjunto creado
        numeros.add(1);
        numeros.add(3);
        numeros.add(5);
        numeros.add(7);
        numeros.add(3); 
        numeros.add(1); 

        System.out.println("Conjunto inicial: " + numeros);

        // Intentar agregar el número 5 nuevamente
         
        agregado = numeros.add(5);

        // Intentar agregar el número 5 nuevamente y verificar si se añadió.
        if (agregado) {
            System.out.println("El número 5 se ha añadido.");
        } else {
            System.out.println("El número 5 no se ha añadido.");
        }

        // Eliminar el número 7 del conjunto
        numeros.remove(7);
        
        System.out.println("Conjunto después de las modificaciones: " + numeros);
	}

}
