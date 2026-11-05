public class Siglas {
	/*
	 * Realiza un programa que lea una frase y la convierta en sus siglas. Por
	 * ejemplo, Escuela Oficial de Idiomas, se convierte en EOI.
	 */
	public static String siglas(String frase) {
		String siglas = "";
		String[] palabras = frase.split("\\s+");
		for (String palabra : palabras) {
			char letra = palabra.charAt(0);
			if (Character.isUpperCase(letra)) {
				siglas = siglas + letra;
			}

		}
		return siglas;
	}
	public static void main(String[] args) {
    	String solucion = siglas("");
		System.out.println(solucion);
	}
}