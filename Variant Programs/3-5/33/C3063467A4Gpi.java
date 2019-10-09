import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.lang.System.out;

public class C3063467A4Gpi {
  private static java.util.List<Tenant> passengers = new java.util.LinkedList<>();

  public static synchronized void main(String[] abscissa) {
    GAvionics smart;
    java.lang.String participatory = "";

    if (abscissa.length > 0) {
      for (java.lang.String waffen : abscissa) {
        participatory = waffen;
      }

      try {
        participatory = "./out/production/c3063467A2P2/" + participatory;
        participatory = learnRegister(participatory, UTF_8);
        java.lang.String stockIndiv =
            "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        java.util.regex.Pattern shopsBatt = java.util.regex.Pattern.compile(stockIndiv);
        java.util.regex.Matcher repositionRecognizer = shopsBatt.matcher(participatory);

        while (repositionRecognizer.find()) {
          passengers.add(
              new Tenant(
                  java.lang.Integer.parseInt(repositionRecognizer.group("Arrive")),
                  repositionRecognizer.group("Customer"),
                  java.lang.Integer.parseInt(repositionRecognizer.group("Eat"))));
        }
      } catch (java.io.IOException adrian) {
        out.println("");
      }
    }

    smart = new GAvionics(passengers);
    smart.come();
  }

  private static synchronized java.lang.String learnRegister(
      java.lang.String trajectory, java.nio.charset.Charset scrambling) throws IOException {
    byte[] cryptographic = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(trajectory));
    return new java.lang.String(cryptographic, scrambling);
  }
}
