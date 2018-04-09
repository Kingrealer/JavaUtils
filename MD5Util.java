import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by liuvv on 2018/4/9.
 */

public class MD5Util {

    private static final char[] hexDigits= {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};

    public static String encode(String string) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(string.getBytes());
            byte[] encodedByte=messageDigest.digest();

            int j = encodedByte.length;
            char str[] = new char[j * 2];
            int k = 0;
            for(int i = 0; i < j; i++) {
                byte byte0 = encodedByte[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        }catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }
}
