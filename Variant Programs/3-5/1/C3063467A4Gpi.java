import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Gpi {
  public static java.util.List<Buyer> visitors = new java.util.LinkedList<>();

  public static synchronized void main(String[] variable) {
    B2Impactor indeed = null;
    java.lang.String perspective = "";

    if (variable.length > 0) {
      for (java.lang.String fh : variable) {
        perspective = (fh);
      }

      try {
        perspective = ("./out/production/c3063467A2P2/" + perspective);
        perspective = (writeDatabase(perspective, StandardCharsets.UTF_8));
        java.lang.String garnerPurch =
            "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        java.util.regex.Pattern storehouseAppropriate =
            java.util.regex.Pattern.compile(garnerPurch);
        java.util.regex.Matcher superstoreConverter = storehouseAppropriate.matcher(perspective);

        while (superstoreConverter.find()) {
          visitors.add(
              new Buyer(
                  java.lang.Integer.parseInt(superstoreConverter.group("Arrive")),
                  superstoreConverter.group("Customer"),
                  java.lang.Integer.parseInt(superstoreConverter.group("Eat"))));
        }
      } catch (java.io.IOException adoptee) {
        System.out.println("");
      }
    }

    indeed = (new B2Impactor(visitors));
    indeed.initiating();
  }

  public static synchronized java.lang.String writeDatabase(
      java.lang.String pathway, java.nio.charset.Charset codec) throws IOException {
    byte[] ciphered = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(pathway));
    return new java.lang.String(ciphered, codec);
  }
}
