package gr.aueb.cf.ch10;

/**
 *
 */

public class CryptoJuliusCeasarApp {
    public static void main(String[] args) {

        String s ="DEF";
        

        System.out.println(encrypt(s,3));
        System.out.println(decrypt(s,3));

    }
    public static String encrypt(String s,int key){
        StringBuilder encrypted =new StringBuilder();
        char ch;

        for (int i =0; i < s.length();i++){
            ch = s.charAt(i);
            if (Character.isUpperCase(ch))
                encrypted.append(cipher(ch,key));
            else encrypted.append(ch);
        }
        return encrypted.toString();
    }
    public static String decrypt(String s,int key){
        StringBuilder decrypted = new StringBuilder();
        char ch;

        for (int i =0;i < s.length();i++){
            ch =s.charAt(i);
            if (Character.isAlphabetic(ch))
                decrypted.append(decipher(ch,key));
            else decrypted.append(ch);
        }
        return decrypted.toString();
    }

    public static char cipher(char ch, int key){
        int m,c;

        m = ch - 65;
        c = (m + key) % 26;

        return (char) (c + 65);


    }
    public static char decipher(char ch,int key){
        int m,c;

        c = ch -65;
        m =((ch - key)+26) % 26;
        return (char)(m + 65);
    }
}
