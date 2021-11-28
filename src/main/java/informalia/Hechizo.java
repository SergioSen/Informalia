package informalia;

/**
 *
 * @author Rodrigo, Blas, Álvaro y Sergio
 */
public class Hechizo {
    
    private TipoHechizo tipo;

    public class Conjuro extends Recurso{
    
        public Conjuro(String nombre, String id, int vOfensivo, int vDefensivo, int vAstucia, TipoHechizo tipo) {
            super(nombre, id, vOfensivo, vDefensivo, vAstucia);
            this.tipo = tipo;
        }

    }

    public TipoHechizo getTipo() {
        return tipo;
    }

}
