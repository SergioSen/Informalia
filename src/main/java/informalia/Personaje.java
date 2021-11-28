package informalia;

/**
 *
 * @author Rodrigo, Blas, Álvaro y Sergio
 */
public class Personaje {

    private String nombre;
    private Raza raza;
    private int fuerza;
    private int inteligencia;
    private int destreza;
    private int vitalidad;
    private String identificador;
    private Recurso[] recursosDisponibles;
    private Recurso recursoActivo;

    protected Personaje(String nombre, Raza raza, int f, int i, int dex, int vit, String id) {

    }

    public String getNombre() {
        return nombre;
    }

    public Raza getRaza() {
        return raza;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getDestreza() {
        return destreza;
    }

    public int getVitalidad() {
        return vitalidad;
    }

    public String getIdentificador() {
        return identificador;
    }

    public Recurso[] getRecursosDisponibles() {
        return recursosDisponibles;
    }

    public void setRecursosDisponibles(Recurso[] recs) {
        recursosDisponibles = recs;
    }

    public Recurso getRecursoActivo() {
        return recursoActivo;
    }

    public void recursoActivoAzar() {

    }

    public void restarVida(int vida) {
        vida -= vida;
    }

    public int sumarPotenciaAtaque() {

        int atq = 0;

        if (recursoActivo instanceof Arma) {
            if (recursoActivo.rango = 0) {
                atq += this.fuerza;
            } else {
                atq += this.destreza;
            }
        } else {
            atq += this.inteligencia;
        }

        if (this instanceof Guerrero) {
            atq += this.virtuosismo;
        } else if (this instanceof Mago) {
            atq += this.poderMagico;
        } else {
            atq += this.virtuosismo + this.poderMagico;
        }

    }

    public int subirPotenciaDefensa() {

    }

}
