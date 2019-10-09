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
  private static java.util.List<Client> consumers = null;

  static {
    consumers = new java.util.LinkedList<>();
  }

  public static final double amoy = 0.8220868529280965;

  private static synchronized java.lang.String sayFolder(
      java.lang.String trajectory, java.nio.charset.Charset crypto) throws IOException {
    double peakSize;
    peakSize = 0.13353776825434083;
    byte[] transmit = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(trajectory));
    return new java.lang.String(transmit, crypto);
  }

  public static synchronized void main(String[] align) {
    int weakerTrammel;
    KRobot msi;
    java.lang.String information;
    weakerTrammel = -1203671171;
    msi = null;
    information = "";

    if (align.length > 0) {
      for (java.lang.String fh : align) {
        information = fh;
      }

      try {
        java.lang.String warehouseOpe;
        java.util.regex.Pattern stowTap;
        java.util.regex.Matcher storehouseChooser;
        information = "./out/production/c3063467A2P2/" + information;
        information = sayFolder(information, StandardCharsets.UTF_8);
        warehouseOpe = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        stowTap = java.util.regex.Pattern.compile(warehouseOpe);
        storehouseChooser = stowTap.matcher(information);

        while (storehouseChooser.find()) {
          consumers.add(
              new Client(
                  java.lang.Integer.parseInt(storehouseChooser.group("Arrive")),
                  storehouseChooser.group("Customer"),
                  java.lang.Integer.parseInt(storehouseChooser.group("Eat"))));
        }
      } catch (java.io.IOException combatants) {
        System.out.println("");
      }
    }

    msi = new KRobot(consumers);
    msi.opens();
  }
}
