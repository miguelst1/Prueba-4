package zoo;

/**
 * La clase sirve para crear objetos Tiburon
 * 
 * @author Miguel Sánchez Torrijo
 * @version 1.0
 * @see <a href="https://github.com/miguelst1/Prueba-4">Enlace a GitHUb</a>
 */

public class Tiburon extends Pez {
    private String especie;
    private boolean peligroso;
    private static int numTiburones = 0;

    /**
     * Constructor
     * Constructor sin parametros que inicializa las variables
     */
    public Tiburon () {
        super(20, Tipo.CARTILAGINOSO, Animal.Habitat.ARTICO, "focas", 100);
        this.especie = "Tiburón blanco";
        this.peligroso = true;
        this.numTiburones ++;
    }
    
    /**
     * Constructor
     *
     * @param especie indica la especia del tiburon
     * @param peligroso indica si es peligroso o no
     * @param velocidadMaxNatacion indica la velocidad maxima de natación
     * @param tipo indica el tipo del tiburón
     */
      
    public Tiburon(String especie, boolean peligroso, int velocidadMaxNatacion, Tipo tipo) {
        super(velocidadMaxNatacion, tipo);
        this.especie = especie;
        this.peligroso = peligroso;
        this.numTiburones ++;
    }

    /**
     * Constructor
     * 
     * @param especie indica la especia del tiburon
     * @param peligroso indica si es peligroso o no
     * @param velocidadMaxNatacion indica la velocidad maxima de natación
     * @param tipo indica el tipo del tiburón
     * @param habitat indica el habitat del tiburón
     * @param comida indica lo que come el tiburón
     * @param longevidad indica los años de vida del tiburón
     */
    
    public Tiburon(String especie, boolean peligroso, int velocidadMaxNatacion, Tipo tipo, Habitat habitat, String comida, int longevidad) {
        super(velocidadMaxNatacion, tipo, habitat, comida, longevidad);
        this.especie = especie;
        this.peligroso = peligroso;
        this.numTiburones ++;
    }
    
    /**
     * Es un método que sirve para desplazar al tiburon, indicando la velocidad a la que nada
     */
    
    public void desplazar() {
        System.out.println("Estoy nadando a " + this.getVelocidadMaxNatacion() + " km/h.");
    }
    
    /**
     * Es un método que sirve dar de comer al tiburon
     */
    
    public void comer() {
        System.out.println("Estoy comiendo " + this.comida);    
    }
    
    @Override
    protected void finalize() throws Throwable {
        numTiburones--;
        super.finalize();
    }
}
