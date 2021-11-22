/**
*@author Christopher
*@version 1.0.0	
*/


public class Main{
	
	public static void main(String[] args){
		String plaintext = "ZACH";
		String key = "BIING";

		AutoKey aKey = new AutoKey(plaintext, key);
		aKey.encrypt();

		System.out.println("Encrypted Text: " + aKey.getEncryptedText());
	}
}