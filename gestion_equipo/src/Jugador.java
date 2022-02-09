
public class Jugador {
	private String nombre;
	private int edad;
	private String idioma;


	public Jugador() {
	}
	public String tipoJugador() {
		String junior = "Junior";
		String senior = "Senior";
		String master = "Master";



		if(edad>=18 && edad<25) {
			return junior;	
		}
		else if(edad>=25 && edad<=35) {
			return senior;	
		}
		else if(edad>35){
			return master;	
		}	
		return null;
	}


public void setNombreJugador(String nombre) {
	boolean letrasIngles = true;

	for (int i = 0; i < nombre.length(); i++) {
		char letra = nombre.charAt(i);
		if (letra >= 65 && letra <= 90) { // letras mayusculas

		} else if (letra >= 97 && letra <= 122) { // letras minusculas
			//if (i == 0) { // descomentar para cambiar solo la primera letra
			nombre = nombre.substring(0, 1).toUpperCase() + nombre.substring(1);
			//}

		} else if (letra == ' ') {

		} else {
			letrasIngles = false;
		}
	}		

	if (letrasIngles && nombre.length() >= 4 && nombre.length() <= 20) {
		this.nombre = nombre;
	}

}

	public void setEdad(int edad) {
		if (edad >= 18 && edad <= 100) this.edad = edad;
		else if(edad==-1) { this.edad=-1;}
	}

	public void setIdioma(String idioma) {
		switch (idioma) {
		case "inglés":
		case "español":
		case "alemán":
		case "francés":
			//En caso de que sea alguno de los anteriores, se asigna el idioma,
			this.idioma = idioma;
			break;
		default:
			//No se asigna idioma.
			break;
		}

	}


	public String getIdioma() {
		return idioma;
	}

	public String getNombreJugador() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}
}
