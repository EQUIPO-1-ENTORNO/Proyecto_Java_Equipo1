import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AsignarEquipoTest {

    //TEST RELACIONADO CON JUGADOR
    /* ASIGNAR JUGADOR QUE NO EXISTA. No se asigna */
    @Test
    void testSetJugadorNoExistente(){
        AsignarEquipo asignarEquipo = new AsignarEquipo();
        Jugador jugador = new Jugador();
        String nombre = null;
        jugador.setNombreJugador(nombre);
        Integer edad = null;
        jugador.setEdad(edad);
        String idioma = null;
        jugador.setIdioma(idioma);
        asignarEquipo.setJugador(null);
    }

    /* ASIGNAR JUGADOR EXISTENTE CON TODOS LOS CAMPOS V�LIDOS. Se asigna*/
    @Test
    void testSetJugadorExistenteCamposValidos(){
        AsignarEquipo asignarEquipo = new AsignarEquipo();
        Jugador jugador = new Jugador();
        String nombre = "thor";
        jugador.setNombreJugador(nombre);
        int edad = 22;
        jugador.setEdad(edad);
        String idioma = "Espa�ol";
        jugador.setIdioma(idioma);
        asignarEquipo.setJugador(jugador);
        Jugador jugadorGuardado = asignarEquipo.getJugador();
        assertNotNull(jugadorGuardado);
        assertEquals(nombre, jugadorGuardado.getNombreJugador());
        assertEquals(edad, jugadorGuardado.getEdad());
        assertEquals(idioma, jugadorGuardado.getIdioma());
    }

    /* Asignar jugador que exista, pero su nombre sea inv�lido */
    @Test
    void testSetJugadorExistenteNombreInvalido(){
        AsignarEquipo asignarEquipo = new AsignarEquipo();
        Jugador jugador = new Jugador();
        String nombre = "or";
        jugador.setNombreJugador(nombre);
        int edad = 22;
        jugador.setEdad(edad);
        String idioma = "Espa�ol";
        jugador.setIdioma(idioma);
        asignarEquipo.setJugador(null);
    }

    /* Asignar jugador que exista, pero no tenga nombre (es decir, hab�is creado el jugador pero no hab�is puesto el nombre con setnombre) */
    @Test
    void testJugadorExistenteSinNombre(){
        AsignarEquipo asignarEquipo = new AsignarEquipo();
        Jugador jugador = new Jugador();
        int edad = 20;
        jugador.setEdad(edad);
        String idioma = "Ingl�s";
        jugador.setIdioma(idioma);
        asignarEquipo.setJugador(null);
    }

    /* Asignar jugador que exista, pero su edad sea inv�lida (podeis poner cualquier edad no v�lida, porque ya se prueba todas las combinaciones posibles en el anterior */
    @Test
    void testJugadorSinNombre(){
        AsignarEquipo asignarEquipo = new AsignarEquipo();
        Jugador jugador = new Jugador();
        String nombre = "Perro";
        jugador.setNombreJugador(nombre);
        int edad = 0;
        jugador.setEdad(edad);
        String idioma = "Ingl�s";
        jugador.setIdioma(idioma);
        asignarEquipo.setJugador(null);
    }

    /* Asignar jugador que exista, pero no tenga edad(es decir, hab�is creado el jugador pero no hab�is puesto el edad con setEdad) */
    @Test
    void testJugadorExistenteSinEdad(){
        AsignarEquipo asignarEquipo = new AsignarEquipo();
        Jugador jugador = new Jugador();
        String nombre = "Perro";
        Integer edad = null;
        jugador.setNombreJugador(nombre);
        jugador.setEdad(edad);
        String idioma = "Ingl�s";
        jugador.setIdioma(idioma);
        asignarEquipo.setJugador(null);
    }

    /* Asignar jugador que exista, pero su idioma sea inv�lido (podeis poner cualquier idioma no v�lido, porque ya se prueba todas las combinaciones posibles en el anterior) */
    @Test
    void testJugadorExistenteIdiomaInvalido(){
        AsignarEquipo asignarEquipo = new AsignarEquipo();
        Jugador jugador = new Jugador();
        String nombre = "or";
        jugador.setNombreJugador(nombre);
        int edad = 22;
        jugador.setEdad(edad);
        String idioma = "Japon�s";
        jugador.setIdioma(idioma);
        asignarEquipo.setJugador(null);
    }

    /* Asignar jugador que exista, pero no tenga idioma(es decir, hab�is creado el jugador pero no hab�is puesto el idioma con setIdioma) */
    @Test
    void testJugadorExistenteSinIdioma(){
        AsignarEquipo asignarEquipo = new AsignarEquipo();
        Jugador jugador = new Jugador();
        String nombre = "thor";
        jugador.setNombreJugador(nombre);
        int edad = 22;
        jugador.setEdad(edad);
        asignarEquipo.setJugador(null);
    }

    //TEST RELACIONADO CON EQUIPO

    //Asignar equipo que no exista (es decir es nulo)
    @Test
    void equipoNulo() {
        Equipo equipo = null;

        AsignarEquipo asignarEquipo = new AsignarEquipo();
        asignarEquipo.setEquipo(equipo);

        assertNull(asignarEquipo.getClass());
    }

    //Asignar equipo que exista y tenga todos sus campos v�lidos
    @Test
    void equipoCorrecto() {
        String nombreEquipo = "Tigretones Malignos";
        int ranking = 1;

        Equipo equipo = new Equipo();
        equipo.setNombreEquipo(nombreEquipo);
        equipo.setRanking(ranking);

        AsignarEquipo asignarEquipo = new AsignarEquipo();
        asignarEquipo.setEquipo(equipo);

        assertEquals(nombreEquipo, asignarEquipo.getEquipo().getNombreEquipo());
        assertEquals(ranking, asignarEquipo.getEquipo().getRanking());
    }

    //Asignar equipo que exista, pero su nombre sea inv�lido (pod�is poner cualquier nombre no v�lido,
    //porque ya se prueba todas las combinaciones posibles en el anterior)
    @Test
    void equipoNombreInvalido() {
        String nombreEquipo = "LOL";
        int ranking = 2;

        Equipo equipo = new Equipo();
        equipo.setNombreEquipo(nombreEquipo);
        equipo.setRanking(ranking);

        AsignarEquipo asignarEquipo = new AsignarEquipo();
        asignarEquipo.setEquipo(equipo);

        assertNull(asignarEquipo.getEquipo().getNombreEquipo());
        assertEquals(ranking, asignarEquipo.getEquipo().getRanking());
    }

    //Asignar equipo que exista, pero no tenga nombre (es decir, hab�is creado el equipo
    //pero no hab�is puesto el nombre con setNombre)
    @Test
    void equipoNombreNulo() {
        int ranking = 1;

        Equipo equipo = new Equipo();
        equipo.setRanking(ranking);

        AsignarEquipo asignarEquipo = new AsignarEquipo();
        asignarEquipo.setEquipo(equipo);

        assertNull(asignarEquipo.getEquipo().getNombreEquipo());
        assertEquals(ranking, asignarEquipo.getEquipo().getRanking());
    }

    //Asignar equipo que exista, pero su ranking sea inv�lida (pod�is poner cualquier ranking no v�lido,
    //porque ya se prueba todas las combinaciones posibles en el anterior)
    @Test
    void equipoRankingInvalido() {
        String nombreEquipo = "Gatetes Furiosos";
        int ranking = 100;

        Equipo equipo = new Equipo();
        equipo.setNombreEquipo(nombreEquipo);
        equipo.setRanking(ranking);

        AsignarEquipo asignarEquipo = new AsignarEquipo();
        asignarEquipo.setEquipo(equipo);

        assertEquals(nombreEquipo ,asignarEquipo.getEquipo().getNombreEquipo());
        assertNull(asignarEquipo.getEquipo().getRanking());
    }

    //Asignar equipo que exista, pero no tenga ranking(es decir,
    //hab�is creado el equipo pero no hab�is puesto el nombre con setNombre)

    //Problemas aqu�, porque un entero no puede ser null,
    //se entiende que null es 0, pero ese es un valor v�lido.
    @Test
    void equipoRankingNulo() {
        String nombreEquipo = "Los Magufos";
        Integer ranking = null;

        Equipo equipo = new Equipo();
        equipo.setNombreEquipo(nombreEquipo);
        equipo.setRanking(ranking);

        AsignarEquipo asignarEquipo = new AsignarEquipo();
        asignarEquipo.setEquipo(equipo);

        assertEquals(nombreEquipo ,asignarEquipo.getEquipo().getNombreEquipo());
        assertNull(asignarEquipo.getEquipo().getRanking());
    }
}