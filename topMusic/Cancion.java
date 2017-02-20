package listadoEstructuras3.topMusic;

/**
 * TopMusic. Implementa un programa que gestione una lista de las canciones mÃ¡s
 * escuchadas. El usuario podrÃ¡: a. AÃ±adir una canciÃ³n (en una posiciÃ³n) al
 * TopMusic. b. Sacar un elemento del TopMusic. c. Subir un puesto en el
 * TopMusic. d. Bajar un puesto en el TopMusic. e. Mostrar la lista TopMusic. f.
 * Mostrar la canciÃ³n mÃ¡s escuchada. Sobre la canciÃ³n se almacenarÃ¡ el
 * tÃ­tulo, artista o grupo y aÃ±o de grabaciÃ³n.
 * 
 * @author Miguel Ã�ngel GavilÃ¡n Merino
 *
 */
public class Cancion {

	/**
	 * TÃ­tulo de la canciÃ³n
	 */
	private String titulo;

	/**
	 * Artista de la canciÃ³n
	 */
	private String artista;

	/**
	 * AÃ±o de la canciÃ³n
	 */
	private int anioGrabacion;

	/**
	 * Constructor de la clase canciÃ³n
	 * 
	 * @param titulo
	 * @param artista
	 * @param anioGrabacion
	 */
	public Cancion(String titulo, String artista, int anioGrabacion) {
		setTitulo(titulo);
		setArtista(artista);
		setAnioGrabacion(anioGrabacion);
	}

	public String getTitulo() {
		return titulo;
	}

	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	private void setArtista(String artista) {
		this.artista = artista;
	}


	private void setAnioGrabacion(int anioGrabacion) {
		this.anioGrabacion = anioGrabacion;
	}

	@Override
	public String toString() {
		return "Cancion [titulo=" + titulo + ", artista=" + artista + ", anioGrabacion=" + anioGrabacion + "]";
	}

}
