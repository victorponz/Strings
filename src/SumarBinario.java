import java.io.CharArrayWriter;

public class SumarBinario {
	public static String sumaBinario(String cad1, String cad2){
        // Para hacerlo más sencillo, suponemos que los números tienen el
        // mismo número de bis
	    String resultado = "";

        if (cad1.length() != cad2.length()) {
            return  "";
        }

        // La primera vez que sumamos, no hay acarreo
        int acarreo = 0;
        int a, b;
        
        //Empezamos desde el bit menos significativo hacia el más
        for (int i = cad1.length() -1; i >= 0; i--) {
            //El primer dígito a sumar
            a = Character.getNumericValue(cad1.charAt(i));

            //El segundo dígito a sumar
            b = Character.getNumericValue(cad2.charAt(i));

            //Sumamos los números más el acarreo
            int suma = acarreo + a + b;

            resultado = (suma % 2) + resultado; // Dara 0 cuando la suma sea 0 o 2
            acarreo = suma / 2; // Dará 1 cuando la suma sea 2 o 3
            /* Lo de arriba es una forma resumida de:
            * if (suma == 0) {
                // En este caso los tres valores eran 0, por lo que el resultado es 0 y el acarreo 0
                acarreo = 0;
                resultado = "0" + resultado;
              }
              else if (suma == 1) {
                // Solo hay un bit que sea 1. Por tanto, no hay acarreo y el resultado es 1
                acarreo = 0;
                resultado = "1" + resultado;
              }
              else if (suma == 2) {
                // Dos bits son 1, por lo que la suma es 0, pero con acarreo 1
                acarreo = 1;
                resultado = "0" + resultado;
              }
              else if (suma == 3) {
                // Todos son 1. Por tanto, el resultado es 1 y el acarreo 1
                acarreo = 1;
                resultado = "1" + resultado;
              }
              */

        }
	      //Si la última suma ha producido acarreo le añadimos un 1 al resultado
	      if (1 == acarreo) {
	    	  resultado = "1" + resultado;
	      }

	      return resultado;
	}
	
	public static void main(String[] args) {		
		String cad1 = Utilidades.leerCadena("Introduce el primer número binario");
		String cad2 = Utilidades.leerCadena("Introduce el segundo número binario");
		System.out.println("La suma es: " + sumaBinario(cad1,cad2));
	}
}
