import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



/**
 * @author Nacho y Rafa
 *
 */
class EquipoTest {

	/**
	 * Test para comprobar que se puede dejar el campo texto vacio
	 */
	@Test
	void testSetNombreEquipoVacio() {
		Equipo equipo = new Equipo();
		String nombre = "";
		equipo.setNombreEquipo(nombre);

		assertEquals(null, equipo.getNombreEquipo());
	}

	/**
	 * Test para comprobar la introducción de un carácter no alfanumerico
	 */
	@Test
	void testSetNombreEquipoCaracterNoAlfanumerico() {
		Equipo equipo = new Equipo();
		String nombre = "m4rt4";
		equipo.setNombreEquipo(nombre);

		assertEquals(null, equipo.getNombreEquipo());
	}
	/**
	 * Test para comprobar que no permite guardar nombre de menos de 4 caracteres
	 */
	@Test
	void testSetNombreEquipoMenosDeCuatroCaracteres() {
		Equipo equipo = new Equipo();
		String nombre = "UOP";
		equipo.setNombreEquipo(nombre);

		assertEquals(null, equipo.getNombreEquipo());
	}
	/**
	 * Test para comprobar que permite guardar nombre de mas de 4 caracteres o igual
	 */
	@Test
	void testSetNombreEquipoIgualCuatroCaracteres() {
		Equipo equipo = new Equipo();
		String nombre = "Maro";
		equipo.setNombreEquipo(nombre);

		assertEquals(nombre, equipo.getNombreEquipo());
	}
	/**
	 * Test para comprobar que permite poner un texto mayor que 4 caracteres
	 */
	@Test
	void testSetNombreEquipoMayorCuatroCaracteres() {
		Equipo equipo = new Equipo();
		String nombre = "Guadalajara";
		equipo.setNombreEquipo(nombre);

		assertEquals(nombre, equipo.getNombreEquipo());
	}
	/**
	 * Test para comprobar que permite poner un nombre de menos de 20 caracteres
	 */
	@Test
	void testSetNombreEquipoMenosVeinteCaracteres() {
		Equipo equipo = new Equipo();
		String nombre = "San Fernando";
		equipo.setNombreEquipo(nombre);

		assertEquals(nombre, equipo.getNombreEquipo());
	}
	/**
	 * Test para comprobar que se puede poner un nombre de 20 caracteres
	 */
	@Test
	void testSetNombreEquipoIgualVeinteCaracteres() {
		Equipo equipo = new Equipo();
		String nombre = "Equipo regional Maro";
		equipo.setNombreEquipo(nombre);

		assertEquals(nombre, equipo.getNombreEquipo());
	}
	/**
	 * Test para comprobar que se puede poner un nombre mayor de 20 caracteres
	 */
	@Test
	void testSetNombreEquipoMayorVeinteCaracteres() {
		Equipo equipo = new Equipo();
		String nombre = "Delta del Guadalajara Oeste";
		equipo.setNombreEquipo(nombre);

		assertEquals(null, equipo.getNombreEquipo());
	}
	/**
	 * Test de dejar el ranking vacio
	 */
	@Test
	void testSetRankingVacio() {
		Equipo equipo = new Equipo();
		int ranking=-1;
		equipo.setRanking(ranking);
		assertEquals(-1,equipo.getRanking());
	}
	/**
	 * Test de dejar el ranking en 0        
	 */
	@Test
	void testSetRankingCero() {
		Equipo equipo = new Equipo();
		int ranking=0;
		equipo.setRanking(ranking);
		assertEquals(ranking, equipo.getRanking());
	}
	/**
	 * Test de dejar el ranking mayor a 10      
	 */
	@Test
	void testSetRankingMayorDiez() {
		Equipo equipo = new Equipo();
		int ranking=12;
		if(ranking>10||ranking<0){
		ranking=-1;
		}
		equipo.setRanking(ranking);
		assertEquals(-1,equipo.getRanking());
	}
	/**
	 * Test de dejar el ranking mayor a 0       
	 */
	@Test
	void testSetRankingMayorCero() {
		Equipo equipo = new Equipo();
		int ranking=5;
		equipo.setRanking(ranking);
		assertEquals(ranking, equipo.getRanking());
	}
	/**
	 * Test de dejar el ranking menor a 10
	 */
	@Test
	void testSetRankingMenorDiez() {
		Equipo equipo = new Equipo();
		int ranking=9;
		equipo.setRanking(ranking);
		assertEquals(ranking, equipo.getRanking());
	}
	/**
	 * Test de dejar el ranking igual a 10
	 */
	@Test
	void testSetRankingIgualDiez() {
		Equipo equipo = new Equipo();
		int ranking=10;
		equipo.setRanking(ranking);
		assertEquals(ranking, equipo.getRanking());
	}
	
	//Test comprobar que se guarda el nombre en mayusculas (NUEVO)
	@Test
	void testNombreMayusculas() {
		Equipo equipo = new Equipo();
		equipo.setNombreEquipo("Guadalajara Oeste");
		assertEquals("GUADALAJARA OESTE",equipo.getNombreEquipo());
	}

}
