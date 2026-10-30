public class Invertida {
	public static String invertir(String frase){
        String[] palabras = frase.split("\\s+");
		String invertida = "";
		for(int i = palabras.length - 1 ; i >= 0; i--){
			invertida = invertida + palabras[i] +" ";
		}
		return invertida;
	}
	public static void main(String[] args) {
        String frase = "Esto es una frase";
		String invertida = invertir(frase);
		System.out.println(invertida);
	}
}
