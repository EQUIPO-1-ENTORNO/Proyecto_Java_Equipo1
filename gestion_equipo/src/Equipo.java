/**
 * Esta clase define objetos de EQUIPO que tiene como atributos nombreEquipo, ranking como se le definen al crear un objeto
 * author: Rafael Cruz / Adolfo Salado
 * version: 11/02/2002
 */
public class Equipo {
	private String nombreEquipo;
	private int ranking;

	/**
	 * Constructor de la clase Equipo
	 */
	public Equipo () {

	}// Cierre del constructor

	/**
	 * SetNombreEquipo recibe un nombre y comprueba cada una de las letras de la palabra, 
	      comprueba si tiene caracter alfanumérico y si es el caso, pasarlo a mayusculas
	 * @param nombreEquipo El parametro define los nombres de los equipos que van a ser comprobados
	 */
	public void setNombreEquipo(String nombreEquipo) {
		boolean correcto = true;

		for (int i = 0; i < nombreEquipo.length(); i++) {

			char letra = nombreEquipo.charAt(i);

			if ((letra >= 65 && letra <= 90) || (letra >= 97 && letra <= 122) || letra == 32) {
				//Es un caracter normal si ser alfanumerico y incluye los espacios
				if (letra >= 97 && letra <= 122) { // letras minusculas
					//if (i == 0) { // descomentar para cambiar solo la primera letra
					nombreEquipo = nombreEquipo.substring(0, 1).toUpperCase() + nombreEquipo.substring(1);
					//}

				}
			}else {

				correcto = false;
			}
		}

		int caracterMinimo = 4;
		int caracterMaximo = 20;

		if (correcto && (nombreEquipo.length() >= caracterMinimo && nombreEquipo.length() <= caracterMaximo)) {

			this.nombreEquipo = nombreEquipo;
		}
	}// Cierre del método

	/**
	 * setRanking recibe un numero y comprueba que no sea nulo  
	 * Una vez comprobado, comprueba que el numero esta dentro de los valores que se premiten como ranking
	 * Si cumple la condicion que esta entre 0 y 10, se guarda correctamente el ranking.
	 * @param ranking El parámetro es un ranking concreto que se va a comprobar.
	 */
	public void setRanking(int ranking) {
		int rankingMinimo = 0;
		int rankingMaximo = 10;

		if (ranking >= rankingMinimo && ranking <= rankingMaximo) {

			this.ranking = ranking;

		}else {
			int edadIncorrecta = -1;

			this.ranking = edadIncorrecta;
		}
	} // Fin método setRanking

	/** 
	 * getNombreEquipo es un método utilizado para devolver el nombre del equipo que tenga el objeto.
	 * @return String nombreEquipo
	 */
	public String getNombreEquipo() {

		return nombreEquipo;
		
	} // Fin del método getNombreEquipo. 

	/**
	 * getRankin es un método que devuelve la posición en el ranking del objeto. 
	 * @return int ranking
	 */
	public int getRanking() {

		return ranking;
	} // Fin del método getRanking

	/**
	 * categoriaEquipo es un método que recibe un valor entero correspondiente al ranking. 
	 * Se comprueba que no sea nulo ni vacío y, posteriorimente, devuelve la categoría correspondiente o,
	 * en caso de no ser una opción válida, se devuelve null. 
	 * @param ranking del equipo que se va a guardar
	 * @return String categoria
	 */
	public String categoriaEquipo(int ranking) {
		String categoria = null;
		String vacio = "";

		if (this.getNombreEquipo() != null && this.getNombreEquipo() != vacio) {

			switch(ranking) {

			case 10, 9, 8, 7:

				categoria = "Primera";

			break;

			case 6, 5, 4, 3:

				categoria = "Segunda";

			break;

			case 2 , 1, 0:

				categoria = "Tercera";

			break;

			}

			return categoria;

		}else {

			return categoria;	
		}
	} // Fin del método categoriaEquipo

}

