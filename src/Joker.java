import java.util.ArrayList;
import java.util.List;

/**
 * https://aceptaelreto.com/problem/statement.php?id=623&cat=21
 */
public class Joker {

    public static boolean comprobarBoleto(String premiado, String boleto) {
        for (char digito : premiado.toCharArray()) {
            if (boleto.indexOf(digito) != -1) {
                boleto = boleto.substring(0, boleto.indexOf(digito)) +  boleto.substring(boleto.indexOf(digito) + 1);
            }
        }
        return boleto.isEmpty();

    }
    public static boolean comprobarBoleto2(String premiado, String boleto) {
        // Convertir `boleto` en un ArrayLista para poder ir borrando elementos
        List<Character> lista = new ArrayList<>();
        for(char c : boleto.toCharArray()){
            lista.add(c);
        }
        // Ahora recorremos los números del premiado y vamos a eliminarlos de la lista
        for (int i = 0; i < premiado.length(); i++) {
            lista.remove((Character) premiado.charAt(i));
        }
        /*
        Cuidado que si lo hacemos como sería más lógico
        for(Character c : lista){
            lista.remove(c);
        }
        Os dará la excepción `checkForComodification`, que se produce siempre que se modifica
        una lista mediante un for-each
        */

        return lista.isEmpty();
    }
}
