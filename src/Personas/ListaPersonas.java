
package Personas;

import java.util.ArrayList;

/**
 *
 * @author jps12
 */
public class ListaPersonas {
    
    ArrayList listaPersonas; // Atributo que identifica un vector de personas

    public ListaPersonas() {
        listaPersonas = new ArrayList(); // Crea el vector de personas

    }

    public void añadirPersona(Persona p) {
        listaPersonas.add(p);
    }

    public void eliminarPersona(int i) {
        listaPersonas.remove(i);
    }

    public void borrarLista() {
        listaPersonas.clear();
    }
    
}
