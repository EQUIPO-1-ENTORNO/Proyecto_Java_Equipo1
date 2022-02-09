import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class JugadorTest {
	
	//Guardar jugador con nombre null
	@Test
        void testSetNombreNull() {
            Jugador jugador = new Jugador();
            String nombreJugador = null;
            try {
                jugador.setNombreJugador(nombreJugador);
            } catch (NullPointerException e) {
            }
            assertNull(jugador.getNombreJugador());
        }

	//Guardar jugador con nombre vacío
	@Test
	void testSetNombreVacio() {
		Jugador jugador = new Jugador();
		String nombreJugador="";
		jugador.setNombreJugador(nombreJugador);

		assertNull(jugador.getNombreJugador());
	}

	//Guardar jugador con carácteres no alfabéticos
	@Test
	void testSetNombreNoAlfabetico() {
		Jugador jugador = new Jugador();
		String nombreJugador = "1!2@3#$4%&/*-;:";
		jugador.setNombreJugador(nombreJugador);

		assertNull(jugador.getNombreJugador());
	}

	//Guardar jugador con letras no usadas en el inglés
	@Test
	void testSetNombreLetrasDistintas() {
		Jugador jugador = new Jugador();
		String nombreJugador = "ñÑçÇáÉìÖû";
		jugador.setNombreJugador(nombreJugador);

		assertNull(jugador.getNombreJugador());
	}

	//Guardar jugador con menos de 4 caracteres
	@Test
	void testSetNombreMenor4Caracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Ana";
		jugador.setNombreJugador(nombreJugador);

		assertNull(jugador.getNombreJugador());

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
		String nombreJugador = "Juan Jose Maria Yoel";
		jugador.setNombreJugador(nombreJugador);

		assertEquals(nombreJugador, jugador.getNombreJugador());
	}

	//Guardar jugador con más de 20 caracteres
	@Test
	void testSetNombreMayor20Caracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Supercalifragilisticuespialidoso";
		jugador.setNombreJugador(nombreJugador);

		assertNull(jugador.getNombreJugador());
	}

	//Test La edad se ha dejado en blanco
	@Test
	void testEdadVacio() {
		Jugador jugador = new Jugador();
		int edad = 0;
		jugador.setEdad(edad);

		assertEquals(0, jugador.getEdad());
	}

	//Test comprobar si la edad es un número válido
	@Test
	void testEdadNumeroValido() {
		Jugador jugador = new Jugador();
		int edad = 20;
		jugador.setEdad(edad);

		assertEquals(edad, jugador.getEdad());
	}


	//Test comprobar si la edad es un número
	@Test
        void testEdadNumeroInvalido() {
            Jugador jugador = new Jugador();
            try {
                Integer edad = Integer.parseInt("p");
                jugador.setEdad(edad);
            } catch (NumberFormatException e) {}

            assertEquals(0, jugador.getEdad());
        }



	//Test comprobar que la edad sea menor a 18
	@Test
	void testEdadMenor18() {
		Jugador jugador = new Jugador();
		int edad = 12;
		jugador.setEdad(edad);

		assertEquals(0, jugador.getEdad());
	}


	//Test comprobar que la edad sea igual a 18
	@Test
	void testEdadIgual18() {
		Jugador jugador = new Jugador();
		int edad = 18;
		jugador.setEdad(edad);

		assertEquals(edad, jugador.getEdad());
	}


	//Test comprobar que la edad sea mayor a 18 pero menor a 100
	@Test
	void testEdadMayor18() {
		Jugador jugador = new Jugador();
		int edad = 21;
		jugador.setEdad(edad);

		assertEquals(edad, jugador.getEdad());
	}


	//Test comprobar que la edad sea igual a 100
	@Test
	void testEdadIgual100() {
		Jugador jugador = new Jugador();
		int edad = 100;
		jugador.setEdad(edad);

		assertEquals(edad, jugador.getEdad());
	}


	//Test comprobar que la edad sea mayor a 100
	@Test
	void testEdadMayor100() {
		Jugador jugador = new Jugador();
		int edad = 111;
		jugador.setEdad(edad);

		assertEquals(0, jugador.getEdad());
	}

	//Test comprobar que el idioma null
        @Test
        void testIdiomaNull() {
            Jugador jugador = new Jugador();
            String idioma = null;
            try {
                jugador.setIdioma(idioma);
            } catch (NullPointerException e) {}
            assertNull(jugador.getIdioma());
        }
	
	//Test comprobar que el idioma no se haya seleccionado
	@Test
	void testIdiomaNoSelec() {
		Jugador jugador = new Jugador();
		String idioma = "";
		jugador.setIdioma(idioma);

		assertNull(jugador.getIdioma());
	}


	//Test comprobar que el idioma seleccionado sea inglés
	@Test
	void testIdiomaIngles() {
		Jugador jugador = new Jugador();
		String idioma = "inglés";
		jugador.setIdioma(idioma);

		assertEquals(idioma, jugador.getIdioma());
	}

	//Test comprobar que el idioma seleccionado sea español
	@Test
	void testIdiomaEspanol() {
		Jugador jugador = new Jugador();
		String idioma = "español";
		jugador.setIdioma(idioma);

		assertEquals(idioma, jugador.getIdioma());
	}

	//Test comprobar que el idioma seleccionado alemán
	@Test
	void testIdiomaAleman() {
		Jugador jugador = new Jugador();
		String idioma = "alemán";
		jugador.setIdioma(idioma);

		assertEquals(idioma, jugador.getIdioma());
	}

	//Test comprobar que el idioma seleccionado francés
	@Test
	void testIdiomaFrances() {
		Jugador jugador = new Jugador();
		String idioma = "francés";
		jugador.setIdioma(idioma);

		assertEquals(idioma, jugador.getIdioma());
	}

	//Test comprobar que el idioma seleccionado sea diferente a los establecidos
	@Test
	void testIdiomaDiferente() {
		Jugador jugador = new Jugador();
		String idioma = "Ruso";
		jugador.setIdioma(idioma);

		assertNull(jugador.getIdioma());
	}
	void testTipoEdadNull() {
		Jugador jugador = new Jugador();
		int edad = -1;
		jugador.setEdad(edad);
		jugador.setIdioma("Español");
		jugador.setNombreJugador("Pepe");

		assertEquals(null, jugador.tipoJugador());
	}
	void testTipoIdiomaNull() {
		Jugador jugador = new Jugador();
		int edad = 18;
		jugador.setEdad(edad);
		jugador.setIdioma("Españo");
		jugador.setNombreJugador("Pepe");

		assertEquals(null, jugador.tipoJugador());
	}
	void testTipoNombreNull() {
		Jugador jugador = new Jugador();
		int edad = 18;
		jugador.setEdad(edad);
		jugador.setIdioma("Español");
		jugador.setNombreJugador("Pep");

		assertEquals(null, jugador.tipoJugador());
	}
	//Test comprobar que edad no pueda ser menor que 18
	@Test
	void testTipoEdadMenos18() {
		Jugador jugador = new Jugador();
		int edad = 5;
		jugador.setEdad(edad);
		jugador.setIdioma("Español");
		jugador.setNombreJugador("Pepe");

		assertEquals(null, jugador.tipoJugador());
	}
	@Test
	void testTipoEdadIgual18() {
		Jugador jugador = new Jugador();
		int edad = 18;
		jugador.setEdad(edad);
		jugador.setIdioma("Español");
		jugador.setNombreJugador("Pepe");
		assertEquals("Junior",jugador.tipoJugador());
	}
	//Test comprobar que devuelve tipo Senior si la edad es menor 25
	@Test
	void testTipoEdadMenor25() {
		Jugador jugador = new Jugador();
		int edad = 24;
		jugador.setEdad(edad);
		jugador.setIdioma("Español");
		jugador.setNombreJugador("Pepe");
		assertEquals("Junior",jugador.tipoJugador());
	}
	//Test comprobar que devuelve tipo Senior si la edad es 25
	@Test
	void testTipoEdadIgual25() {
		Jugador jugador = new Jugador();
		int edad = 25;
		jugador.setEdad(edad);
		jugador.setIdioma("Español");
		jugador.setNombreJugador("Pepe");

		//int edad = Integer.parseInt("p");
		assertEquals("Senior",jugador.tipoJugador());
	}
	//Test comprobar que devuelve tipo Master si la edad es 35
	@Test
	void testTipoEdadIgual25() {
		Jugador jugador = new Jugador();
		int edad = 35;
		jugador.setEdad(edad);
		jugador.setIdioma("Español");
		jugador.setNombreJugador("Pepe");

		//int edad = Integer.parseInt("p");
		assertEquals("Master",jugador.tipoJugador());
	}
	@Test
	void testTipoEdadMayor35() {
		Jugador jugador = new Jugador();
		int edad = 36;
		jugador.setEdad(edad);
		jugador.setIdioma("Español");
		jugador.setNombreJugador("Pepe");
		assertEquals("Master",jugador.tipoJugador());
	}
	
	//Test comprobar que se guarda el nombre en mayusculas (NUEVO)
	@Test
	void testNombreMayusculas() {
		Jugador jugador = new Jugador();
		jugador.setNombreJugador("javier");
		assertEquals("JAVIER",jugador.getNombreJugador());
	}
}
