public class Anagrama {
    public static boolean esAnagrama(String original, String anagrama){
        boolean esta;
        String aux = "";
        // Si no tienen la misma cantidad de letras, es imposible que sea anagramas
        if (original.length() != anagrama.length()) return false;

        for (int i = 0; i < original.length(); i++) {
            // Busco el carácter iésimo de la palabra original
            esta = false;
            for (int j = 0; j < anagrama.length(); j++) {
                // Y con ese carácter original, busco si está el de la cadena a comprobar
                if (original.charAt(i) == anagrama.charAt(j)){
                    // Si lo encuentro, ya no busco más
                    esta = true;
                    // Y me guardo ese carácter para asegurarme de que
                    aux += anagrama.charAt(j);
                    break;
                }
            }
            if (!esta) return false;
        }
        return (aux.length() == original.length());
    }
}
