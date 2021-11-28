package informalia;

/**
 *
 * @author Rodrigo, Blas, Álvaro y Sergio
 */
public class Mago extends Personaje {
    
    int poderMagico;

    public Mago(String nombre, Raza raza, int f, int i, int dex, int vit, String id, int poderM, Hechizo[] hechizos) {
        super(nombre, raza, f, i, dex, vit, id);
        poderMagico = poderM;
        setRecursosDisponibles(hechizos);
    }
    
    public int getPoderMagico() {
        return poderMagico;
    }

}
