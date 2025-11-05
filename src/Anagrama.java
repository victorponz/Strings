public class Anagrama {
    public static boolean esAnagrama(String original, String comparar){
        boolean esta;
        if (original.length() != comparar.length()) return false;

        for (int i = 0; i < original.length(); i++) {
            esta = false;
            for (int j = 0; j < comparar.length(); j++) {
                if (original.charAt(i) == comparar.charAt(j)){
                    esta = true;
                    break;
                }
            }
            if (!esta) return false;
        }
        return true;
    }
}
