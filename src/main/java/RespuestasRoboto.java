import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RespuestasRoboto {
    public String respuesta (String frase){
        Pattern pat = Pattern.compile("Me llamo (\\w+)");
        Matcher mat = pat.matcher(frase);
        Pattern pat = Pattern.compile("¿Que tiempo hace en (\\w+)\\?");
        Matcher mat = pat.matcher(frase);
          if (mat.find("Me llamo (\\w+)")) {
              return ("Te vas a " + mat.group(1) + " y lo miras");
          }else{
              return ("Encantada de conocerme, " + math.group(2))
            return "Hola";
        }

}



