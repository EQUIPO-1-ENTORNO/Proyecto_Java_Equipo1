/**
 * Clase Jugador que tiene como atributos un nombre, una edad y un idioma
 * author Equipo 1 - DAM
 *
 */
public class Jugador {
	private String nombre;
	private int edad;
	private String idioma;

	/**
	 * setNombreJugador es un método que guarda el nombre del jugador
	 * @param nombre Recibe el nombre de un jugador concreto.
	 */
	public void setNombreJugador(String nombre) {
		if (esValido(nombre)){

			//Se pasa el nombre a mayúsculas
			String nombreMayusculas = nombre.toUpperCase();

			//Comprobación del rango
			if (rangoValido(nombreMayusculas)) {

				//Comprobación de las letras
				if (esPalabra(nombreMayusculas)){
					this.nombre = nombreMayusculas;
				}
			}
		}
	}
	
	/**
	 * getNombre devuelve el nombre del jugador del objeto. 
	 * @return nombre
	 */
	public String getNombreJugador() {
		return nombre;
	}

	/**
	 * setEdad guarda la edad del jugador, siempre que esté entre 18 y 100 años.
	 * En el caso de que no cumpla la condición, devolvería -1. 
	 * @param edad Es la edad de un jugador concreto. 
	 */
	public void setEdad(int edad) {

		//Comprobación de la edad
		if (edadValida(edad)){
			this.edad = edad;
		}

	}
	
	/**
	 * getEdad devuelve la edad del objeto.
	 * @return edad
	 */
	public int getEdad() {
		return edad;
	}
	
	/**
	 * setIdioma guarda el idioma si es Inglés, Español, Alemán o Francés. 
	 * Si no, no se asigna. 
	 * @param idioma Recibe un idioma. 
	 */
	public void setIdioma(String idioma) {
		

		//Se pasa el idomma a minúsculas
		String idiomaMin = idioma.toLowerCase();

		//Se revisa si es válido
		if (esValido(idiomaMin)) {
			if (idiomaValido(idiomaMin)) {
				this.idioma = idioma;
			}

		}
	}
	
	/**
	 * getIdioma es un método que devuelve el idioma del objeto. 
	 * @return idioma 
	 */
	public String getIdioma() {
		return idioma;
	}


	/**
	 * El método tipoJugador devolverá un String a partir de la edad de los jugadores. 
	 * @return String
	 */
	public String getTipoJugador() {
		
		String junior = "Junior";
		String senior = "Senior";
		String master = "Master";

		//Variables para los rangos de edades
		int edadMinimaJunior = 18;
		int edadMaximaJunior = 25;
		int edadMinimaSenior = 26;
		int edadMaximaSenior = 35;
		int edadMinimaMaster = 36;
		int edadCero = 0;

			if (getEdad() >= edadMinimaJunior
					&& getEdad() <= edadMaximaJunior) {

				return junior;

			} else if (getEdad() >= edadMinimaSenior
					&& getEdad() <= edadMaximaSenior) {

				return senior;

			} else if (getEdad() >= edadMinimaMaster) {

				return master;

			} else {
				return null;
			}

	}
	
	/**
	 * El método esValido devolverá un String a partir de la edad de los jugadores.
	 * Comprobamos con un boolean si es nulo
	 * @return boolean
	 */
	private Boolean esValido(String comprobar) {

		if (comprobar != null) {

			return true;
		}
		return false;
	}

	/**
	* El metodo rangoValido devolverá un string a partir del rango minimo y maximo
	* @param recibe un String
	* @return rangoValido
	*/
	private boolean rangoValido(String comprobar){
		int largoMinimo = 4;
		int largoMaximo = 20;

		if (comprobar.length() >= largoMinimo
				&& comprobar.length() <= largoMaximo ){
			return true;
		}
		return false;
	}

	/**
	*comprueba que las letras sean iguales al abecedario español
	* @param devuelve true si las letras corresponden al abecedario español
	*/
	private boolean esPalabra(String comprobar){
		char a = 65;
		char z = 90;
		char espacio = 32;

		for (int i = 0; i < comprobar.length(); i++) {
			char c = comprobar.charAt(i);
			if (!(c >= a && c <= z || c==espacio)) {
				return false;
			}
		}
		return true;
	}

	/**
	*comprueba que el rango de edad es correcto
	* @param Devuelve true si el rango de edad es correcto
	*/
	private boolean edadValida(int comprobarEdad){
		int edadCero = 0;
		int edadMinima = 18;
		int edadMaxima = 100;

		if (comprobarEdad != edadCero){

			if (comprobarEdad >= edadMinima && comprobarEdad <= edadMaxima){
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	/**
	* comprueba que el idioma sea válido
	* @param devuelve true si el idioma es válido
	*/
	private boolean idiomaValido(String idioma){
		String[] listaIdiomas =  {"aleman", "ingles", "espanol", "frances"};
		String vacio = " ";

		if (!idioma.equals(vacio)){
			for (int i = 0; i < listaIdiomas.length; i++) {
				if (idioma.contains(listaIdiomas[i])){
					return true;
				}
			}

		}
		return false;
	}

}
