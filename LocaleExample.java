
import java.util.Locale;

public class LocaleExample {
    public static void main(String[] args) {
        Locale locale1 = new Locale("en", "US"); // English (United States)
        Locale locale2 = new Locale("fr", "FR"); // French (France)
        
        System.out.println("Locale 1: " + locale1.getDisplayName());
        System.out.println("Locale 2: " + locale2.getDisplayName());
    }
}
