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
  public static java.util.List<Audience> client;

  public static synchronized void main(String[] sender) {
    GAvionics shim;
    java.lang.String opinions = "";

    if (sender.length > 0) {
      for (java.lang.String ora : sender) {
        opinions = ora;
      }

      try {
        opinions = "./out/production/c3063467A2P2/" + opinions;
        opinions = translateDocuments(opinions, StandardCharsets.UTF_8);
        java.lang.String supermarketSupp =
            "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        java.util.regex.Pattern warehouseWell = java.util.regex.Pattern.compile(supermarketSupp);
        java.util.regex.Matcher warehouseBrite = warehouseWell.matcher(opinions);

        while (warehouseBrite.find()) {
          client.add(
              new Audience(
                  java.lang.Integer.parseInt(warehouseBrite.group("Arrive")),
                  warehouseBrite.group("Customer"),
                  java.lang.Integer.parseInt(warehouseBrite.group("Eat"))));
        }
      } catch (java.io.IOException former) {
        System.out.println("");
      }
    }

    shim = new GAvionics(client);
    shim.embark();
  }

  public static synchronized java.lang.String translateDocuments(
      java.lang.String route, java.nio.charset.Charset encrypt) throws IOException {
    byte[] coded = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(route));
    return new java.lang.String(coded, encrypt);
  }

  static {
    client = new java.util.LinkedList<>();
  }
}
