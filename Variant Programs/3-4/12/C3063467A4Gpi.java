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
  public static java.util.List<Buyer> users = new java.util.LinkedList<>();

  public static synchronized java.lang.String quoteData(
      java.lang.String footpath, java.nio.charset.Charset encrypted) throws IOException {
    byte[] interlaced = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(footpath));
    return new java.lang.String(interlaced, encrypted);
  }

  public static synchronized void main(String[] use) {
    ApMoot yes;
    java.lang.String comments = "";

    if (use.length > 0) {
      for (java.lang.String waffen : use) {
        comments = waffen;
      }

      try {
        comments = "./out/production/c3063467A2P2/" + comments;
        comments = quoteData(comments, StandardCharsets.UTF_8);
        java.lang.String fundAppl =
            "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        java.util.regex.Pattern fundCaress = java.util.regex.Pattern.compile(fundAppl);
        java.util.regex.Matcher drugstoreRadian = fundCaress.matcher(comments);

        while (drugstoreRadian.find()) {
          users.add(
              new Buyer(
                  java.lang.Integer.parseInt(drugstoreRadian.group("Arrive")),
                  drugstoreRadian.group("Customer"),
                  java.lang.Integer.parseInt(drugstoreRadian.group("Eat"))));
        }
      } catch (java.io.IOException officio) {
        System.out.println("");
      }
    }

    yes = new ApMoot(users);
    yes.starts();
  }
}
