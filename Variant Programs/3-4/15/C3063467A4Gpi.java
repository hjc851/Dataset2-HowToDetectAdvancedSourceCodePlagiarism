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
  static double upstairsMax = 0.25004589996437243;

  private static synchronized java.lang.String readableArchiving(
      java.lang.String lane, java.nio.charset.Charset uncompressed) throws IOException {
    int appraise;
    appraise = -1051441494;
    byte[] stored = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(lane));
    return new java.lang.String(stored, uncompressed);
  }

  static {
    clients = new java.util.LinkedList<>();
  }

  public static synchronized void main(String[] variable) {
    double maximal;
    P4Mimic siem;
    java.lang.String response;
    maximal = 0.5328674488124927;
    response = "";

    if (variable.length > 0) {
      for (java.lang.String fh : variable) {
        response = fh;
      }

      try {
        java.lang.String shopExplanatory;
        java.util.regex.Pattern stockSlick;
        java.util.regex.Matcher groceryPseudorandom;
        response = "./out/production/c3063467A2P2/" + response;
        response = readableArchiving(response, StandardCharsets.UTF_8);
        shopExplanatory = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        stockSlick = java.util.regex.Pattern.compile(shopExplanatory);
        groceryPseudorandom = stockSlick.matcher(response);

        while (groceryPseudorandom.find()) {
          clients.add(
              new Employer(
                  java.lang.Integer.parseInt(groceryPseudorandom.group("Arrive")),
                  groceryPseudorandom.group("Customer"),
                  java.lang.Integer.parseInt(groceryPseudorandom.group("Eat"))));
        }
      } catch (java.io.IOException adrian) {
        System.out.println("");
      }
    }

    siem = new P4Mimic(clients);
    siem.resume();
  }

  private static java.util.List<Employer> clients;
}
