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

  public static synchronized void main(String[] sender) {
    P4Mimic shum = null;
    java.lang.String influence = "";

    if (sender.length > 0) {
      for (java.lang.String ora : sender) {
        influence = ora;
      }

      try {
        influence = "./out/production/c3063467A2P2/" + influence;
        influence = writeDatabase(influence, StandardCharsets.UTF_8);
        java.lang.String shopExplanatory =
            "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        java.util.regex.Pattern depotDab = java.util.regex.Pattern.compile(shopExplanatory);
        java.util.regex.Matcher storefrontCreaser = depotDab.matcher(influence);

        while (storefrontCreaser.find()) {
          visitors.add(
              new Subscriber(
                  java.lang.Integer.parseInt(storefrontCreaser.group("Arrive")),
                  storefrontCreaser.group("Customer"),
                  java.lang.Integer.parseInt(storefrontCreaser.group("Eat"))));
        }
      } catch (java.io.IOException libris) {
        System.out.println("");
      }
    }

    shum = new P4Mimic(visitors);
    shum.initiate();
  }

  public static java.util.List<Subscriber> visitors = null;

  static {
    visitors = new java.util.LinkedList<>();
  }

  public static synchronized java.lang.String writeDatabase(
      java.lang.String footpath, java.nio.charset.Charset uncompressed) throws IOException {
    byte[] decrypt = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(footpath));
    return new java.lang.String(decrypt, uncompressed);
  }
}
