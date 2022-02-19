package module6.Mod6Prob3;

import module6.Mod6Prob2.MessageEncoder;

public class SubstitutionCipher implements MessageEncoder, MessageDecoder{
    int shift;
    public SubstitutionCipher (int shift) {
        this.shift = shift;
    }

    private char shifter(char letter) {
        return (char)(letter + this.shift);
    }

    private char unshifter(char letter) {
        return (char)(letter - this.shift);
    }

    @Override
    public String encode(String txt) {
        String ans = "";

        for (char c : txt.toCharArray()) {
            ans += Character.toString((shifter(c)));
        }

        return ans;
    }

    @Override
    public String decode(String txt) {
        String ans = "";

        for (char c : txt.toCharArray()) {
            ans += Character.toString((unshifter(c)));
        }

        return ans;
    }
}
