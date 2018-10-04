import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.BadPaddingException;
import java.security.MessageDigest;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
 
public class HW2 {    
  static void P1() throws Exception {
    byte[] cipherText = Files.readAllBytes(Paths.get("cipher1.txt"));
    
    // BEGIN SOLUTION
    byte[] iv = new byte[] { 0, 0, 0, 0, 
                             0, 0, 0, 0, 
                             0, 0, 0, 0, 
                             0, 0, 0, 0 };
    byte[] key;
    byte[] plainText = cipherText;    
    // END SOLUTION
    
    System.out.println(new String(plainText, StandardCharsets.UTF_8));
  }

  static void P2() throws Exception {    
    // BEGIN SOLUTION
    for (int i = 0; i < 1; i++) {
      byte[] message = Files.readAllBytes(Paths.get(String.format("messages/plain2%d.txt", i)));
    }
    // END SOLUTION
  }

  static void P3() throws Exception {
    byte[] cipherText = Files.readAllBytes(Paths.get("cipher3.txt"));
    
    // BEGIN SOLUTION
    byte[] plainText = cipherText;    
    // END SOLUTION
    
    System.out.println(new String(plainText, StandardCharsets.UTF_8));
  }

  static void P4() throws Exception {
    byte[] iv = new byte[] { 0, 0, 0, 0, 
                             0, 0, 0, 0, 
                             0, 0, 0, 0, 
                             0, 0, 0, 0 };
    byte[] cipherText = Files.readAllBytes(Paths.get("cipher4.txt"));
    
    // BEGIN SOLUTION
    byte[] plainText = cipherText;    
    // END SOLUTION
    
    System.out.println(new String(plainText, StandardCharsets.UTF_8));
  }

  public static void main(String [] args) {
    try {  
      P1();
      P2();
      P3();
      P4();
    } catch (Exception e) {
      e.printStackTrace();
    } 
  }
}