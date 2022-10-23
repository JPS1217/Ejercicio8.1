
package Personas;

/**
 *
 * @author jps12
 */
public class Persona {
    
    String nombre; // Atributo que identifica el nombre de una persona
    String apellidos;
    /* Atributo que identifica los apellidos de una
        persona */
    String teléfono; // Atributo que identifica el teléfono de una persona
    String dirección;

    /* Atributo que identifica la dirección de una
    persona */

    public Persona(String nombre, String apellidos, String teléfono,
            String dirección) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.teléfono = teléfono;
        this.dirección = dirección;
    }
    
}
