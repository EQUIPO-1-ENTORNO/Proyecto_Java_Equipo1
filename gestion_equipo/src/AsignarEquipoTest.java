import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AsignarEquipoTest {

    //TEST RELACIONADO CON JUGADOR
    /* ASIGNAR JUGADOR QUE NO EXISTA. No se asigna */
    @Test
    void testSetJugadorNoExistente(){
        AsignarEquipo asignarEquipo = new AsignarEquipo();
        Jugador jugador = new Jugador();
        jugador = null;

        
        //asignarEquipo.setJugador(jugador);

        assertEquals(null, asignarEquipo.getJugador());
    }

    /* ASIGNAR JUGADOR EXISTENTE CON TODOS LOS CAMPOS VÁLIDOS. Se asigna*/
    @Test
    void testSetJugadorExistenteCamposValidos(){
        AsignarEquipo asignarEquipo = new AsignarEquipo();

        Jugador jugador = new Jugador();
        String nombre = "thor";
        jugador.setNombreJugador(nombre);
        int edad = 22;
        jugador.setEdad(edad);
        String idioma = "Español";
        jugador.setIdioma(idioma);

        asignarEquipo.setJugador(jugador);

        Jugador jugadorGuardado = asignarEquipo.getJugador();
    
        assertNotNull(jugadorGuardado);
        assertEquals(nombre, jugadorGuardado.getNombreJugador());
        assertEquals(edad, jugadorGuardado.getEdad());
        assertEquals(idioma, jugadorGuardado.getIdioma());
    }

    /* Asignar jugador que exista, pero su nombre sea inválido */
    @Test
    void testSetJugadorExistenteNombreInvalido(){
        AsignarEquipo asignarEquipo = new AsignarEquipo();
        Jugador jugador = new Jugador();

        String nombre = "or";
        jugador.setNombreJugador(nombre);

        int edad = 22;
        jugador.setEdad(edad);

        String idioma = "Español";
        jugador.setIdioma(idioma);

        asignarEquipo.setJugador(jugador);

        assertNull(asignarEquipo.getJugador());
    }

    /* Asignar jugador que exista, pero no tenga nombre (es decir, habéis creado el jugador pero no habéis puesto el nombre con setnombre) */
    @Test
    void testJugadorExistenteSinNombre(){
        AsignarEquipo asignarEquipo = new AsignarEquipo();
        Jugador jugador = new Jugador();

        String nombre = null;

        int edad = 20;
        jugador.setEdad(edad);

        String idioma = "Inglés";
        jugador.setIdioma(idioma);

        asignarEquipo.setJugador(jugador);

        assertNull(asignarEquipo.getJugador());
    }

    /* Asignar jugador que exista, pero su edad sea inválida (podéis poner cualquier edad no válida,
    porque ya se prueba todas las combinaciones posibles en el anterior */
    @Test
    void testJugadorEdadInvalida(){
        AsignarEquipo asignarEquipo = new AsignarEquipo();
        Jugador jugador = new Jugador();

        String nombre = "Perro";
        jugador.setNombreJugador(nombre);
    }

        //Comentado de momento porque veremos las excepciones más adelante
 /*       int edad = Integer.parseInt("p");
        jugador.setEdad(edad);

        String idioma = "Inglés";
        jugador.setIdioma(idioma);

        asignarEquipo.setJugador(jugador);

        assertNull(asignarEquipo.getJugador());
    }
*/ 
        
    /* Asignar jugador que exista, pero no tenga edad(es decir, habéis creado el jugador pero no habéis puesto el edad con setEdad) */
    @Test
    void testJugadorExistenteSinEdad(){
        AsignarEquipo asignarEquipo = new AsignarEquipo();
        Jugador jugador = new Jugador();

        String nombre = "Perro";
        jugador.setNombreJugador(nombre);

        Integer edad = null;

        String idioma = "Inglés";
        jugador.setIdioma(idioma);

        asignarEquipo.setJugador(jugador);

        assertNull(asignarEquipo.getJugador());
    }

    /* Asignar jugador que exista, pero su idioma sea inválido (podeis poner cualquier idioma no válido, porque ya se prueba todas las combinaciones posibles en el anterior) */
    @Test
    void testJugadorExistenteIdiomaInvalido(){
        AsignarEquipo asignarEquipo = new AsignarEquipo();
        Jugador jugador = new Jugador();

        String nombre = "Thor";
        jugador.setNombreJugador(nombre);

        int edad = 22;
        jugador.setEdad(edad);

        String idioma = "Japonés";
        jugador.setIdioma(idioma);

        asignarEquipo.setJugador(jugador);

        assertNull(asignarEquipo.getJugador());
    }

    /* Asignar jugador que exista, pero no tenga idioma(es decir, habéis creado el jugador pero no habéis puesto el
    idioma con setIdioma) */
    @Test
    void testJugadorExistenteSinIdioma(){
        AsignarEquipo asignarEquipo = new AsignarEquipo();
        Jugador jugador = new Jugador();

        String nombre = "thor";
        jugador.setNombreJugador(nombre);

        int edad = 22;
        jugador.setEdad(edad);

        String idioma = null;

        asignarEquipo.setJugador(jugador);

        assertNull(asignarEquipo.getJugador());
    }

    //TEST RELACIONADO CON EQUIPO

    //Asignar equipo que no exista (es decir es nulo)
    @Test
    void equipoNulo() {
        Equipo equipo = null;

        AsignarEquipo asignarEquipo = new AsignarEquipo();
        asignarEquipo.setEquipo(equipo);

        assertEquals(null,asignarEquipo.getEquipo());
    }

    //Asignar equipo que exista y tenga todos sus campos válidos
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

    //Asignar equipo que exista, pero su nombre sea inválido (podéis poner cualquier nombre no válido,
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

        assertNull(asignarEquipo.getEquipo());
    }

    //Asignar equipo que exista, pero no tenga nombre (es decir, habéis creado el equipo
    //pero no habéis puesto el nombre con setNombre)
    @Test
    void equipoNombreNulo() {
        int ranking = 1;

        Equipo equipo = new Equipo();
        equipo.setRanking(ranking);

        AsignarEquipo asignarEquipo = new AsignarEquipo();
        asignarEquipo.setEquipo(equipo);

        assertNull(asignarEquipo.getEquipo());
    }

    //Asignar equipo que exista, pero su ranking sea inválida (podéis poner cualquier ranking no válido,
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
    //habéis creado el equipo pero no habéis puesto el nombre con setNombre)

    //Problemas aquí, porque un entero no puede ser null,
    //se entiende que null es 0, pero ese es un valor válido.
    @Test
    void equipoRankingNulo() {
        String nombreEquipo = "Los Magufos";
        Integer ranking = -1;

        Equipo equipo = new Equipo();
        equipo.setNombreEquipo(nombreEquipo);
        equipo.setRanking(ranking);

        AsignarEquipo asignarEquipo = new AsignarEquipo();
        asignarEquipo.setEquipo(equipo);

        assertEquals(nombreEquipo ,asignarEquipo.getEquipo().getNombreEquipo());
        assertNull(asignarEquipo.getEquipo().getRanking());
    }
}
