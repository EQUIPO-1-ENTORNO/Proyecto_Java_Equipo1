import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

	
class JugadorTest {
	

	//Guardar jugador con nombre vac�o
	@Test
	void testSetNombreVacio() {
		Jugador jugador = new Jugador();
		String nombreJugador="";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(null,jugador.getNombreJugador());
		
	}	

	//Guardar jugador con car�cteres no alfab�ticos
	@Test
	void testSetNombreNoAlfabetico() {
		Jugador jugador = new Jugador();
		String nombreJugador = "1!2@3#$4%&/*-;:";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(null,jugador.getNombreJugador());
		
	}

	//Guardar jugador con letras no usadas en el ingl�s
	@Test
	void testSetNombreLetrasDistintas() {
		Jugador jugador = new Jugador();
		String nombreJugador = "���������";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(null,jugador.getNombreJugador());
		
	}

 	//Guardar jugador con menos de 4 caracteres
	@Test
	void testSetNombreMenor4Caracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Ana";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(null,jugador.getNombreJugador());
		
	}
	
	//Guardar jugador con 4 caracteres
	@Test
	void testSetNombreIgual4Caracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Juan";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador,jugador.getNombreJugador());
		
	}

	//Guardar jugador con mas de 4 caracteres pero menos de 20
	@Test		
	void testSetNombreMayor4Caracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Mario";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador, jugador.getNombreJugador());
	}

	//Guardar jugador con 20 caracteres
	@Test		
	void testSetNombreIgual20Caracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Juan Jos� Mar�a Yoel";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador, jugador.getNombreJugador());
	}	

	//Guardar jugador con mas de 20 caracteres
	@Test		
	void testSetNombreMayor20Caracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Supercalifragilisticuespialidoso";
		jugador.setNombreJugador(nombreJugador);
		
		assertEquals(nombreJugador, jugador.getNombreJugador());
	}

	//Test La edad se ha dejado en blanco
	@Test
	void testEdadVacio() {
		Jugador jugador = new Jugador();
		int edad;
		jugador.setEdad(edad);
		
		assertEquals (0, jugador.getEdad());
	}

	//Test comprobar si la edad es un n�mero
	@Test
	void testEdadVacio() {
		Jugador jugador = new Jugador();
		int edad=ejemplo;
		jugador.setEdad(edad);
		
		assertEquals (0, jugador.getEdad());
	}
	
	//Test comprobar que la edad sea menor a 18
	@Test
	void testEdadMenor18() {
		Jugador jugador = new Jugador();
		int edad = 12;
		jugador.setEdad(edad);
		
		assertEquals (0, jugador.getEdad());
	}

	
	//Test comprobar que la edad sea igual a 18
	@Test
	void testEdadIgual18() {
		Jugador jugador = new Jugador();
		int edad = 18;
		jugador.setEdad(edad);
		
		assertEquals (edad, jugador.getEdad());
	}
	
	
	//Test comprobar que la edad sea mayor a 18 pero menor a 100
	@Test
	void testEdadMayor18() {
		Jugador jugador = new Jugador();
		int edad = 21;
		jugador.setEdad(edad);
		
		assertEquals (0, jugador.getEdad());
	}
	
	
	//Test comprobar que la edad sea igual a 100
	@Test
	void testEdadIgual100() {
		Jugador jugador = new Jugador();
		int edad = 100;
		jugador.setEdad(edad);
		
		assertEquals (edad, jugador.getEdad());
	}
	
	
	//Test comprobar que la edad sea mayor a 100
	@Test
	void testEdadMayor100() {
		Jugador jugador = new Jugador();
		int edad = 111;
		jugador.setEdad(edad);
		
		assertEquals (0, jugador.getEdad());
	}
	
	//Test comprobar que el idioma no se haya seleccionado
	@Test
	void testIdiomaNoSelec() {
		Jugador jugador = new Jugador();
		String idioma = " ";
		jugador.setIdioma(idioma);;
		
		assertEquals (null, jugador.getIdioma());
	}
	
	
	//Test comprobar que el idioma seleccionado sea ingl�s
	@Test
	void testIdiomaIngles() {
		Jugador jugador = new Jugador();
		String idioma = "Ingl�s";
		jugador.setIdioma(idioma);;
		
		assertEquals (idioma, jugador.getIdioma());
	}
	
	//Test comprobar que el idioma seleccionado sea espa�ol
	@Test
	void testIdiomaEspa�ol() {
		Jugador jugador = new Jugador();
		String idioma = "Espa�ol";
		jugador.setIdioma(idioma);;
		
		assertEquals (idioma, jugador.getIdioma());
	}
	
	//Test comprobar que el idioma seleccionado alem�n
	@Test
	void testIdiomaAleman() {
		Jugador jugador = new Jugador();
		String idioma = "Alem�n";
		jugador.setIdioma(idioma);;
		
		assertEquals (idioma, jugador.getIdioma());
	}
	
	//Test comprobar que el idioma seleccionado franc�s
	@Test
	void testIdiomaFrances() {
		Jugador jugador = new Jugador();
		String idioma = "Franc�s";
		jugador.setIdioma(idioma);;
		
		assertEquals (idioma, jugador.getIdioma());
	}
	
	//Test comprobar que el idioma seleccionado sea diferente a los establecidos
	@Test
	void testIdiomaDiferente() {
		Jugador jugador = new Jugador();
		String idioma = "Ruso";
		jugador.setIdioma(idioma);;
		
		assertEquals (null, jugador.getIdioma());
	}
}