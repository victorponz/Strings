public class LongitudI {
    public static int comprueba(String cadena, int k){
        String[] palabras = cadena.split(" ");
        int contador = 0;

        for (int i = 0; i < palabras.length; i++) {
            // Si la longitud es igual al largo pedido, aumentamos el contador
            if (palabras[i].length() == k) contador++;
        }

        return contador;
    }

}
