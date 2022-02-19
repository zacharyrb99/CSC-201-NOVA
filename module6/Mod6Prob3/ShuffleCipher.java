package module6.Mod6Prob3;

import module6.Mod6Prob2.MessageEncoder;

public class ShuffleCipher implements MessageEncoder, MessageDecoder{
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

    @Override
    public String decode(String txt) {
        String ans = "";
        ans = unshuffler(txt);
        for (int i = 0; i < n - 1; i++) {
            ans = unshuffler(ans);
        }

        return ans;
    }

    public String shuffler(String msg) {
        int len = msg.length();
        int half, len1, len2, i;
        char c;
        String firstHalf="", secondHalf="", ans="";
        
        if(len % 2 != 0) {
            half = (len / 2) + 1;
        } else {
            half = len / 2;
        }

        for(i=0; i  < half; i++) {
            c = msg.charAt(i);
            firstHalf += c;
        }

        for(i = half; i < len; i++) {
            c = msg.charAt(i);
            secondHalf += c;
        }

        len1 = firstHalf.length();

        len2 = secondHalf.length();

        if(len1 == len2) {
            for(i=0; i<len1; i++) {
                c = firstHalf.charAt(i);
                ans += c;
                c = secondHalf.charAt(i);
                ans += c;
            }
        } else {
            for(i=0; i<len2; i++) {
                c = firstHalf.charAt(i);
                ans += c;
                c = secondHalf.charAt(i);
                ans += c;
            }
            
            c = firstHalf.charAt(i);
            ans += c;
        }

        return ans;
    }

    public String unshuffler(String msg) {
        int len = msg.length();
        String firstHalf = "", secondHalf = "", ans = "";
        for (int i = 0; i < len; i ++) {
            if (i == 0 || i % 2 == 0) {
                firstHalf += msg.charAt(i);
            } else {
                secondHalf += msg.charAt(i);
            }
        }

        ans = firstHalf + secondHalf;
        return ans;
    }
}
