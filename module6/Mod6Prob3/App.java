package module6.Mod6Prob3;

public class App {
    public static void main(String[] args) {
        SubstitutionCipher subCipher = new SubstitutionCipher(3);
        ShuffleCipher shufCipher = new ShuffleCipher(1);
        
        String encoded = subCipher.encode("hello");
        String shuffled = shufCipher.encode("abcdefghi");

        System.out.println(encoded);
        System.out.println(subCipher.decode(encoded));

        System.out.println(shuffled);
        System.out.println(shufCipher.decode(shuffled));
    }
}
