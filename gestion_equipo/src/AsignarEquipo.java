public class AsignarEquipo {

	private Equipo equipo;
	private Jugador jugador;



	public AsignarEquipo() {

	}

	public void setEquipo(Equipo equipo) {

		if (equipo != null) {
			if ( equipo.getNombreEquipo() != null && equipo.getRanking() != 0) {

				this.equipo = equipo;


			}  
		}


	}

	public void setJugador(Jugador jugador) {


		String idioma = jugador.getIdioma();

		if(jugador != null) {
			if (jugador.getEdad() != -1 && jugador.getNombreJugador() != null && jugador.getIdioma() != null) {

				this.jugador = jugador;

			}

		}

	}

