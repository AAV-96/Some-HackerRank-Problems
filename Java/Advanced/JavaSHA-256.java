import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.io.*;
import java.util.*;

public class build_demo {

	public static void main(String[] args) throws IOException, Exception {
		Scanner sc = new Scanner(System.in);
        String org = sc.next();
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(org.getBytes());
        byte[] digest = md.digest();
        StringBuffer sb = new StringBuffer();
        for (byte b : digest) {
            sb.append(String.format("%02x", b & 0xff));
        }
        System.out.println(sb.toString());
        sc.close();
	}

}
