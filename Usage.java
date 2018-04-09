
/**
 * Created by liuvv on 2018/4/9.
 */
 
public class Usage {
    public static final String MD5_EXAMPLE_TEXT = "MD5_EXAMPLE_TEXT";

    public static void main(String[] args) {
        MD5Usage();
    }
	
    public static void MD5Usage() {
        System.out.println(MD5Util.encode(MD5_EXAMPLE_TEXT));
    }
}
