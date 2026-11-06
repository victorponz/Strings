public class Anagrama {
    public static boolean esAnagrama(String original, String anagrama){
        /**
         * No se puede hacer con arrays. Debería poder borrar letras
         */
        boolean esta;
        // Si no tienen la misma cantidad de letras, es imposible que sea anagramas
        if (original.length() != anagrama.length()) return false;
        // alma malo
        for (int i = 0; i < original.length(); i++) {
            // Busco el carácter iésimo de la palabra original
            esta = false;
            for (int j = 0; j < anagrama.length(); j++) {
                // Y con ese carácter original, busco si está el de la cadena a comprobar
                if (original.charAt(i) == anagrama.charAt(j)){
                    // Si lo encuentro, ya no busco más
                    esta = true;
                    // Quito la letra para que no la vuelva a encontrar
                    anagrama = quitarLetra(anagrama, j);
                    break;
                }
            }
            if (!esta) return false;
        }
        return (anagrama.isEmpty());
    }
    public static String quitarLetra(String a, int i){
        String aux = "";
        aux = a.substring(0, i);
        aux += a.substring(i+1);
        return aux;
    }
}
