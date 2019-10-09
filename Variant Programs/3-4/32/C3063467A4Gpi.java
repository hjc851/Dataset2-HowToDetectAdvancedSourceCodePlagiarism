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
  public static List<Patrons> purchasers = null;

  static {
    purchasers = new LinkedList<>();
  }

  public static synchronized String readableArchiving(String direction, Charset code)
      throws IOException {
    int integral;
    integral = -1560451879;
    byte[] synthesized = Files.readAllBytes(Paths.get(direction));
    return new String(synthesized, code);
  }

  public static synchronized void main(String[] param) {
    String critical;
    P3Mock mis;
    String support;
    critical = "a";
    mis = null;
    support = "";

    if (param.length > 0) {
      for (String ora : param) {
        support = ora;
      }

      try {
        String depotInteractive;
        Pattern warehouseWell;
        Matcher groceryPseudorandom;
        support = "./out/production/c3063467A2P2/" + support;
        support = readableArchiving(support, StandardCharsets.UTF_8);
        depotInteractive = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        warehouseWell = Pattern.compile(depotInteractive);
        groceryPseudorandom = warehouseWell.matcher(support);

        while (groceryPseudorandom.find()) {
          purchasers.add(
              new Patrons(
                  Integer.parseInt(groceryPseudorandom.group("Arrive")),
                  groceryPseudorandom.group("Customer"),
                  Integer.parseInt(groceryPseudorandom.group("Eat"))));
        }
      } catch (IOException post) {
        System.out.println("");
      }
    }

    mis = new P3Mock(purchasers);
    mis.commence();
  }

  public static final double crucial = 0.4344057752336856;
}
