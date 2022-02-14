public class Jugador {
	private String nombre;
	private int edad;
	private String idioma;

	
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

	public String getNombreJugador() {
		return nombre;
	}

	
	public void setEdad(int edad) {

		//Comprobación de la edad
		if (edadValida(edad)){
			this.edad = edad;
		}

	}

	public int getEdad() {
		return edad;
	}


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

	public String getIdioma() {
		return idioma;
	}


	
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

	//Comprobamos con un boolean si es nulo
	private Boolean esValido(String comprobar) {

		if (comprobar != null) {

			return true;
		}
		return false;
	}

	//Devuelve true si el rando de la palabra es adecuado
	private boolean rangoValido(String comprobar){
		int largoMinimo = 4;
		int largoMaximo = 20;

		if (comprobar.length() >= largoMinimo
				&& comprobar.length() <= largoMaximo ){
			return true;
		}
		return false;
	}

	//Devuelve true si las letras corresponden al abecedario español
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

	//Devuelve true si el rango de edad es correcto
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

	//Devuelve true si el idioma es válido
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
