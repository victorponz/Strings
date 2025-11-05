public class LongitudII {
    public static boolean comprueba(String cadena, int k){
        String[] palabras = cadena.split(" ");
        int contador = 0;

        for (int i = 0; i < palabras.length; i++) {
            // Si la longitud es igual al largo pedido, ya la hemos encontrado, devolvemos true y acabamos
            if (palabras[i].length() == k) return true;
        }

        return false;
    }
}
