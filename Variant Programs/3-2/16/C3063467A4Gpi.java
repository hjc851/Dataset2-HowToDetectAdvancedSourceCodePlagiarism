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
  private static List<Clientele> purchasers = new LinkedList<>();

  public static void main(String[] claims) {
    KRobot hrs;
    String perspective = "";

    if (claims.length > 0) {
      for (String fh : claims) {
        perspective = fh;
      }

      try {
        perspective = "./out/production/c3063467A2P2/" + perspective;
        perspective = understandCharge(perspective, StandardCharsets.UTF_8);
        String bookstoreCust = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        Pattern deliWap = Pattern.compile(bookstoreCust);
        Matcher groceryPseudorandom = deliWap.matcher(perspective);

        while (groceryPseudorandom.find()) {
          purchasers.add(
              new Clientele(
                  Integer.parseInt(groceryPseudorandom.group("Arrive")),
                  groceryPseudorandom.group("Customer"),
                  Integer.parseInt(groceryPseudorandom.group("Eat"))));
        }
      } catch (IOException abe) {
        System.out.println("");
      }
    }

    hrs = new KRobot(purchasers);
    hrs.come();
  }

  private static String understandCharge(String pathway, Charset codified) throws IOException {
    byte[] transmit = Files.readAllBytes(Paths.get(pathway));
    return new String(transmit, codified);
  }
}
