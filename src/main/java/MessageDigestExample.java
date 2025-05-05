/**
 * 
 */

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 
 */
public class MessageDigestExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String name = "Thirumal";
		try {
			var messageDigest = MessageDigest.getInstance("SHA-256");
			byte[] hash = messageDigest.digest(name.getBytes());
			System.out.println(hash);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
