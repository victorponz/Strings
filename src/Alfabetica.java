public class Alfabetica {

	public static boolean esAlfabetica(String cadena) {
		// Recorremos todo el array comparando un carácter con el siguiente. Si el carácter primero es mayor, la palabra
		// no es alfabética y acabamos.
		// Java compara los caracteres como si fuera un diccionario, ordenado de la `a` a la `z`
		// Llegamos a `cadena.length() - 1` porque el último no tiene siguiente
		for(int i = 0; i < cadena.length() - 1; i++){
			if(cadena.charAt(i) > cadena.charAt(i+1)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String palabra =  "amor";
		if ( !palabra.isEmpty()) {
			if(esAlfabetica(palabra)) {
				System.out.println("La palabra es alfabética");
			}
			else {
				System.out.println("La palabra no es alfabética");
			}
		} else {
			System.out.println("Introduzca una palabra de más de una letra");
		}
	}
}