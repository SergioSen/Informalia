package informalia;

/**
 *
 * @author Rodrigo, Blas, Álvaro y Sergio
 */
public class Guerrero extends Personaje {
    
    int virtuosismo;

    public Guerrero(String nombre, Raza raza, int f, int i, int dex, int vit, String id, int virt, Arma[] armas) {
        super(nombre, raza, f, i, dex, vit, id);
        virtuosismo = virt;
        setRecursosDisponibles(armas);
    }
    
    public int getVirtuosismo() {
        return virtuosismo;
    }

}
