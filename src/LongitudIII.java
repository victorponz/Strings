public class LongitudIII {
    public static boolean comprueba(String cadena, int k){
        String[] palabras = cadena.split(" ");
        int contador = 0;

        for (int i = 0; i < palabras.length; i++) {
            // Si la longitud es mayor al largo pedido, ya la hemos encontrado, devolvemos false y acabamos
            if (palabras[i].length() >= k) return false;
        }
        // Aquí solo llegará cuando todas sean cortas
        return true;
    }
}
