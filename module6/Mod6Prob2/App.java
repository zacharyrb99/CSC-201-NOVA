package module6.Mod6Prob2;

public class App {
    public static void main(String[] args) {
        SubstitutionCipher subCipher = new SubstitutionCipher(3);
        ShuffleCipher shufCipher = new ShuffleCipher(1);
        
        System.out.println(subCipher.encode("hello"));
        System.out.println(shufCipher.encode("abcdefghi"));
    }
}
