/**
 * Esta clase recibe dos objetos: Uno de tipo de Equipo y otro de tipo Jugador.
 * author: Equipo 1 - 1&ordm; - C.F.G.S Desarrollo de Aplicaciones Multiplataformas
 * version: 09/22/2002
 */
public class AsignarEquipo {
	
	private Equipo equipo;
	private Jugador jugador;

	/**
	 * Constructor de la clase AsignarEquipo
	 */
	public AsignarEquipo() {
		
	} // Cierre del constructor
	
	/**
	 * SetEquipo recibe un equipo y comprueba si el equipo no es nulo.
	 * Si no es nulo, comprueba que el nombre del equipo no sea nulo
	 * y que su Ranking sea distinto de cero.
	 * @param equipo El parámetro Equipo es un equipo en concreto el cual se comprobarÃ¡.
	 */

	public void setEquipo(Equipo equipo) {
		/* Variables refactorizadas */
		int sinRanking = -1;
		
		if (equipo != null) {
			if (equipo.getNombreEquipo() != null
					&& equipo.getRanking() != sinRanking) {
				
				this.equipo = equipo; //Se setea correctamente el equipo.
				
			}
		}
	} // Cierre del método

	/**
	 * setJugador recibe un jugador y comprueba que no sea nulo.
	 * Una vez comprobado, comprueba que la edad sea distinta de -1,
	 * que el nombre del jugador no sea nulo y, que el idioma, tampoco lo sea.
	 * Si cumple con esas condiciones, se guarda correctamente el jugador.
	 * @param jugador El parámetro es un jugador concreto que se va a comprobar.
	 */
	public void setJugador(Jugador jugador) {
		/* Variables refactorizadas */
		int edadNula = -1;
		String idioma = jugador.getIdioma(); //Obtenemos el idioma.
		
		if (jugador != null) {
			if (jugador.getEdad() != edadNula
					&& jugador.getNombreJugador() != null
					&& jugador.getIdioma() != null) {
				
				this.jugador = jugador; // Se setea correctamente el jugador.
				
			}
		}
	} // Cierre del método
} // Cierre de la clase AsignarEquipo
