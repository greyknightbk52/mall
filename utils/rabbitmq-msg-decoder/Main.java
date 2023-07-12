import java.util.Base64;
import java.math.BigInteger;
public class Main {
    public static void main( String args[] ) {
        // Get base64-encoded message from RabbitMQ management UI (NACK & requeue)
        String encodedString = "rO0ABXNyAA5qYXZhLmxhbmcuTG9uZzuL5JDMjyPfAgABSgAFdmFsdWV4cgAQamF2YS5sYW5nLk51bWJlcoaslR0LlOCLAgAAeHAAAAAAAAAAVw==";

        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        BigInteger decoded = new BigInteger(decodedBytes);
        System.out.println("Decoded String of " + encodedString + " is " + decoded.longValue());
    }
}
