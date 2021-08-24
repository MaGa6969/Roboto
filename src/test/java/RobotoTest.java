import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class RobotoTest {

    @Test
    void cuandoSaludasTeDevuelveElSaludo(){
        RespuestasRoboto saludo = new RespuestasRoboto();
        String respuesta = saludo.respuesta("Hola, Roboto");
        assertThat(respuesta, equalTo("Hola"));
    }

    @Test
    void cuandoPreguntoElTiempoMeDevuelveElTiempo(){
        RespuestasRoboto tiempo = new RespuestasRoboto();
        String respuesta = tiempo.respuesta( "¿Que tiempo hace en Barcelona?");
        assertThat(respuesta, equalTo("Te vas a Barcelona y lo miras"));
    }

    @Test
    void cuandoLeDigoMiNombreYMeSaluda(){
        RespuestasRoboto nombre = new RespuestasRoboto();
        String respuesta = nombre.respuesta("Me llamo Ana");
        assertThat(respuesta, equalTo("Encantada de conocerme, Ana"));

    }

}
