package cursoJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validaciones {
	public static boolean esApodo(String letra) {
		Pattern patronAbc = Pattern.compile("^([a-zA-ZÒ—0-9]){3,23}$");
		Matcher matcher = patronAbc.matcher(letra);
		return matcher.matches();
		}
	public static boolean esLetra(String letra) {
		Pattern patronAbc = Pattern.compile("^[a-zA-Z—Ò]{3,23}$");
		Matcher matcher = patronAbc.matcher(letra);
		return matcher.matches();
		}
	public static boolean esPosicion(String letra) {
		Pattern patronAbc = Pattern.compile("^[1-9]{1}$");
		Matcher matcher = patronAbc.matcher(letra);
		return matcher.matches();
		}
}
