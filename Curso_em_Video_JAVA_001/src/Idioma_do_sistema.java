import java.util.Locale;

public class Idioma_do_sistema {
    public static void main(String[] args) throws Exception {
        Locale locale = Locale.getDefault();
        System.out.println("Idioma do sistema: " + locale.getDisplayLanguage());
    } 
}
