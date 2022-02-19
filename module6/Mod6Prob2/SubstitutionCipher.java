package module6.Mod6Prob2;

public class SubstitutionCipher implements MessageEncoder {
    int shift;
    public SubstitutionCipher (int shift) {
        this.shift = shift;
    }

    @Override
    public String encode(String txt) {
        String ans = "";

        for (char c : txt.toCharArray()) {
            ans += Character.toString((shifter(c)));
        }

        return ans;
    }

    private char shifter(char letter) {
        return (char)(letter + this.shift);
    }
}
