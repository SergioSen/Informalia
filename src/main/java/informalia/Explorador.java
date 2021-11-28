package informalia;

/**
 *
 * @author Rodrigo, Blas, Álvaro y Sergio
 */
public class Explorador extends Personaje {
    
    int poderMagico;
    int virtuosismo;

    public Explorador(String nombre, Raza raza, int f, int i, int dex, int vit, String id, int virt, int poderM, Recurso[] recursos) {
        super(nombre, raza, f, i, dex, vit, id);
        virtuosismo = virt;
        poderMagico = poderM;
        setRecursosDisponibles(recs);
    }
    
    public int getPoderMagico() {
        return poderMagico;
    }

    public int getVirtuosismo() {
        return virtuosismo;
    }

}
