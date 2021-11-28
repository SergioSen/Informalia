package informalia;

/**
 *
 * @author Rodrigo, Blas, Álvaro y Sergio
 */
public class Recurso {
    
    private String nombre;
    private String identificador;
    private int valorOfensivo;
    private int valorDefensivo;
    private int valorAstucia;

    protected Recurso(String nombre, String id, int vOfensivo, int vDefensivo, int vAstucia) {
        this.nombre = nombre;
        identificador = id;
        valorOfensivo = vOfensivo;
        valorDefensivo = vDefensivo;
        valorAstucia = vAstucia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificador() {
        return identificador;
    }

    public int getValorOfensivo() {
        return valorOfensivo;
    }

    public int getValorDefensivo() {
        return valorDefensivo;
    }

    public int getValorAStucia() {
        return valorAstucia;
    }

    public void modificar(int vOfensivo, int vDefensivo, int vAstucia) {

    }
}
