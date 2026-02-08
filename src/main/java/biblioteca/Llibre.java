package biblioteca;

/**
 * La clase Llibre representa un libro de una biblioteca. Contiene información
 * sobre el título, el autor, el número de ejemplares disponibles y el precio
 * del libro.
 *
 * Permite realizar operaciones como prestar y devolver ejemplares, así como
 * mostrar los datos del libro.
 *
 * @author Tu nombre
 * @version 1.0
 */
public class Llibre {

    /**
     * Título del libro
     */
    private String titol;

    /**
     * Autor del libro
     */
    private String autor;

    /**
     * Número de ejemplares disponibles
     */
    private int exemplars;

    /**
     * Precio del libro
     */
    private float preu;

    /**
     * Constructor de la clase Llibre.
     *
     * @param titol Título del libro
     * @param autor Autor del libro
     * @param exemplars Número de ejemplares disponibles
     * @param preu Precio del libro
     */
    public Llibre(String titol, String autor, int exemplars, float preu) {
        this.titol = titol;
        this.autor = autor;
        this.exemplars = exemplars;
        this.preu = preu;
    }

    /**
     * Devuelve el título del libro.
     *
     * @return título del libro
     */
    public String getTitol() {
        return titol;
    }

    /**
     * Devuelve el autor del libro.
     *
     * @return autor del libro
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Devuelve el número de ejemplares disponibles.
     *
     * @return número de ejemplares
     */
    public int getExemplars() {
        return exemplars;
    }

    /**
     * Devuelve el precio del libro.
     *
     * @return precio del libro
     */
    public float getPreu() {
        return preu;
    }

    /**
     * Presta una cantidad determinada de ejemplares del libro.
     *
     * @param quantitat número de ejemplares a prestar
     * @throws Exception si no hay suficientes ejemplares disponibles
     */
    public void prestarLlibre(int quantitat) throws Exception {
        if (exemplars >= quantitat) {
            exemplars -= quantitat;
            System.out.println("Se han prestado " + quantitat + " ejemplares.");
        } else {
            throw new Exception("No hay suficientes ejemplares disponibles.");
        }
    }

    /**
     * Devuelve una cantidad determinada de ejemplares del libro.
     *
     * @param quantitat número de ejemplares a devolver
     */
    public void retornarLlibre(int quantitat) {
        exemplars += quantitat;
        System.out.println("Se han devuelto " + quantitat + " ejemplares.");
    }

    /**
     * Muestra por pantalla los datos del libro.
     */
    public void mostrarDades() {
        System.out.println("Título: " + titol);
        System.out.println("Autor: " + autor);
    }
}
