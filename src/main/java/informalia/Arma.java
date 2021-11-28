package informalia;

/**
 *
 * @author Rodrigo, Blas, Álvaro y Sergio
 */
public class Arma extends Recurso {
    
    private int manejo;
    private int rango;

    public Arma(String nombre, String id, int vOfensivo, int vDefensivo, int vAstucia, int manejo, int rango) {
        super(nombre, id, vOfensivo, vDefensivo, vAstucia);
        this.manejo = manejo;
        this.rango = rango;
    }
    
    public int getManejo() {
        return manejo;
    }

    public int getRango() {
        return rango;
    }

}
