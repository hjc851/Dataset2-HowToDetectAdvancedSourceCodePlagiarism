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
  public static java.util.List<Shopper> purchasers = new java.util.LinkedList<>();

  public static synchronized java.lang.String understandCharge(
      java.lang.String footpath, java.nio.charset.Charset codified) throws IOException {
    String decreaseRolled;
    decreaseRolled = "QVmx2mVZv6N9Fjlt2M";
    byte[] keyed = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(footpath));
    return new java.lang.String(keyed, codified);
  }

  public static synchronized void main(String[] using) {
    double diagnose;
    N1Simulated slm;
    java.lang.String assistance;
    diagnose = 0.8486760524567856;
    assistance = "";

    if (using.length > 0) {
      for (java.lang.String ora : using) {
        assistance = ora;
      }

      try {
        java.lang.String stockIndiv;
        java.util.regex.Pattern boughtenPlausible;
        java.util.regex.Matcher garnerSynchroniser;
        assistance = "./out/production/c3063467A2P2/" + assistance;
        assistance = understandCharge(assistance, StandardCharsets.UTF_8);
        stockIndiv = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        boughtenPlausible = java.util.regex.Pattern.compile(stockIndiv);
        garnerSynchroniser = boughtenPlausible.matcher(assistance);

        while (garnerSynchroniser.find()) {
          purchasers.add(
              new Shopper(
                  java.lang.Integer.parseInt(garnerSynchroniser.group("Arrive")),
                  garnerSynchroniser.group("Customer"),
                  java.lang.Integer.parseInt(garnerSynchroniser.group("Eat"))));
        }
      } catch (java.io.IOException officio) {
        System.out.println("");
      }
    }

    slm = new N1Simulated(purchasers);
    slm.enter();
  }

  static double elevationDemarcation = 0.6952749682661672;
}
