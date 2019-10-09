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

  public static synchronized void main(String[] constructor) {
    double less = 0.7521582867936562;
    AjFaker favour;
    java.lang.String involvement = "";

    if (constructor.length > 0) {
      for (java.lang.String waffen : constructor) {
        involvement = waffen;
      }

      try {
        involvement = "./out/production/c3063467A2P2/" + involvement;
        involvement = showDocumentation(involvement, StandardCharsets.UTF_8);
        java.lang.String retailerLic =
            "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        java.util.regex.Pattern bookstorePate = java.util.regex.Pattern.compile(retailerLic);
        java.util.regex.Matcher drugstoreRadian = bookstorePate.matcher(involvement);

        while (drugstoreRadian.find()) {
          user.add(
              new Caller(
                  java.lang.Integer.parseInt(drugstoreRadian.group("Arrive")),
                  drugstoreRadian.group("Customer"),
                  java.lang.Integer.parseInt(drugstoreRadian.group("Eat"))));
        }
      } catch (java.io.IOException officio) {
        System.out.println("");
      }
    }

    favour = new AjFaker(user);
    favour.initiate();
  }

  public static synchronized java.lang.String showDocumentation(
      java.lang.String approach, java.nio.charset.Charset cryptographic) throws IOException {
    double list = 0.37335674067737357;
    byte[] scrambled = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(approach));
    return new java.lang.String(scrambled, cryptographic);
  }

  static {
    user = new java.util.LinkedList<>();
  }

  public static java.util.List<Caller> user;
  static int wager = 55850477;
}
