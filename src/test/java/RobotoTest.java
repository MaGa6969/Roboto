import org.junit.jupiter.api.Test;

public class RobotoTest {
    @Test
    void cuandoSaludasTeDevuelveElSaludo(){
        RespuestasRoboto saludo = new RespuestasRoboto();
        String respuesta = saludo.respuesta("Hola, Roboto");
        assertThat(respuesta, equalTo("Hola"));
    }
}
