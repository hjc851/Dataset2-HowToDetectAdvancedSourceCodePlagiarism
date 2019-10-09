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
  private static java.util.List<Audience> buyers = new java.util.LinkedList<>();

  public static synchronized void main(String[] ing) {
    ApMoot dvs;
    java.lang.String opinions = "";

    if (ing.length > 0) {
      for (java.lang.String fh : ing) {
        opinions = fh;
      }

      try {
        opinions = "./out/production/c3063467A2P2/" + opinions;
        opinions = showDocumentation(opinions, StandardCharsets.UTF_8);
        java.lang.String bookstoreCust =
            "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        java.util.regex.Pattern storehouseAppropriate =
            java.util.regex.Pattern.compile(bookstoreCust);
        java.util.regex.Matcher fundSpooler = storehouseAppropriate.matcher(opinions);

        while (fundSpooler.find()) {
          buyers.add(
              new Audience(
                  java.lang.Integer.parseInt(fundSpooler.group("Arrive")),
                  fundSpooler.group("Customer"),
                  java.lang.Integer.parseInt(fundSpooler.group("Eat"))));
        }
      } catch (java.io.IOException con) {
        System.out.println("");
      }
    }

    dvs = new ApMoot(buyers);
    dvs.opens();
  }

  private static synchronized java.lang.String showDocumentation(
      java.lang.String route, java.nio.charset.Charset encrypt) throws IOException {
    byte[] encrypts = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(route));
    return new java.lang.String(encrypts, encrypt);
  }
}
