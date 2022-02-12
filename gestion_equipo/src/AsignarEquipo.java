public class AsignarEquipo {
	/* Atributos */
	private Equipo equipo;
	private Jugador jugador;

	/* Constructor de la clase */
	public AsignarEquipo() {

	}
	
	/* Método para asignar equipo */
	public void setEquipo(Equipo equipo) {

		if (equipo != null) {
			if (equipo.getNombreEquipo() != null 
			    && equipo.getRanking() != 0) {

				this.equipo = equipo;
				
			}  
		}
	}

	/* Método para asignar jugador */
	public void setJugador(Jugador jugador) {
		/* Variables locales refactorizadas */
		int edad = jugador.getEdad();
		String nombre = jugador.getNombreJugador();
		String idioma = jugador.getIdioma();
		int edadIncorrecta = -1;
		
		if(jugador != null) {
			if (edad != edadIncorrecta 
			    && nombre != null 
			    && idioma != null) {

				this.jugador = jugador;

		}
	}
}

