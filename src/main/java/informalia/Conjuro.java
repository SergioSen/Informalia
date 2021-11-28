package informalia;

/**
 *
 * @author Rodrigo, Blas, Álvaro y Sergio
 */
public class Conjuro extends Recurso {

    private Ingrediente[] ingredientes;

    public Conjuro(String nombre, String id, int vOfensivo, int vDefensivo, int vAstucia) {
        super(nombre, id, vOfensivo, vDefensivo, vAstucia);
    }
    
    public Ingrediente[] getIngredientes() {
        return ingredientes;
    }

}
