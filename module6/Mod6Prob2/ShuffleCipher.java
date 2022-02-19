package module6.Mod6Prob2;

public class ShuffleCipher implements MessageEncoder {
    int n;

    public ShuffleCipher (int n) {
        this.n = n;
    }

    @Override
    public String encode(String txt) {
        String ans = "";
        ans = shuffler(txt);
        for (int i = 0; i < n - 1; i++) {
            ans = shuffler(ans);
        }

        return ans;
    }

    public String shuffler(String msg) {
        int len = msg.length();
        int half, len1, len2, i;
        char c;
        String first_half="", second_half="", ans="";
        
        if(len % 2 != 0) {
            half = (len / 2) + 1;
        } else {
            half = len / 2;
        }

        for(i=0; i<half; i++) {
            c = msg.charAt(i);
            first_half += c;
        }

        for(i = half; i < len; i++) {
            c = msg.charAt(i);
            second_half += c;
        }

        len1 = first_half.length();

        len2 = second_half.length();

        if(len1 == len2) {
            for(i=0; i<len1; i++) {
                c = first_half.charAt(i);
                ans += c;
                c = second_half.charAt(i);
                ans += c;
            }
        } else {
            for(i=0; i<len2; i++) {
                c = first_half.charAt(i);
                ans += c;
                c = second_half.charAt(i);
                ans += c;
            }
            
            c = first_half.charAt(i);
            ans += c;
        }

        return ans;
    }
}