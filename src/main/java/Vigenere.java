public class Vigenere{

    /**
     * @param args the command line arguments
     */
    
    // định nghĩa bộ vigenere37 
    static String vigenere37 ="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789,";
    
    // chuyển đổi để length_key = length cần mã hóa/giải mã
    static String generateKey(String str, String key)
    {
        int x = str.length();

        for (int i = 0; ; i++)
        {
            if (x == i)
                i = 0;
            if (key.length() == str.length())
                break;
            key+=(key.charAt(i));
        }
        return key;
    }

    // This function returns the encrypted text
    // generated with the help of the key
    static String encode(String str, String key)
    {
        String cipher_text="";

        for (int i = 0; i < str.length(); i++)
        {
            // converting in range 0-37
            int x = (vigenere37.indexOf(str.charAt(i)) + vigenere37.indexOf(key.charAt(i))) %37;

            System.out.println(x);
            cipher_text+=vigenere37.charAt(x);
        }
        return cipher_text;
    }

    // This function decrypts the encrypted text
    // and returns the original text
    static String decode(String cipher_text, String key)
    {
        String orig_text="";

        for (int i = 0 ; i < cipher_text.length() &&
                                i < key.length(); i++)
        {
            // converting in range 0-37
            int x = (vigenere37.indexOf(cipher_text.charAt(i)) -
                        vigenere37.indexOf(key.charAt(i)) + 37) %37;

            orig_text+=vigenere37.charAt(x);
        }
        return orig_text;
    }

    // This function will convert the lower case character to Upper case
    static String LowerToUpper(String s)
    {
        StringBuffer str =new StringBuffer(s);
        for(int i = 0; i < s.length(); i++)
        {
            if(Character.isLowerCase(s.charAt(i)))
            {
                str.setCharAt(i, Character.toUpperCase(s.charAt(i)));
            }
        }
        s = str.toString();
        return s;
    }
    public static void main(String[] args) {
        
    // test hàm
        String Str = "1,2,3,4,5,6,7,8,9,10";
        String Keyword = "LTM13";

              String str = LowerToUpper(Str);
              String keyword = LowerToUpper(Keyword);

            String key = generateKey(str, keyword);
           
            System.out.println(key);
            
            String cipher_text = encode(str, key);

            System.out.println("Ciphertext : "
                + cipher_text + "\n");

            System.out.println("Original/Decrypted Text : "
                + decode(cipher_text, key));
            
    }
    
}

