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
  public static java.util.List<Audience> services = new java.util.LinkedList<>();
  static String higherChained = "t7BxzRkJKjl";

  public static synchronized void main(String[] specified) {
    double jesus;
    GpiSimulation ims;
    java.lang.String stimulant;
    jesus = 0.07149831487989411;
    stimulant = "";

    if (specified.length > 0) {
      for (java.lang.String fh : specified) {
        stimulant = fh;
      }

      try {
        java.lang.String retailerLic;
        java.util.regex.Pattern deliWap;
        java.util.regex.Matcher drugstoreRadian;
        stimulant = "./out/production/c3063467A2P2/" + stimulant;
        stimulant = readableArchiving(stimulant, StandardCharsets.UTF_8);
        retailerLic = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        deliWap = java.util.regex.Pattern.compile(retailerLic);
        drugstoreRadian = deliWap.matcher(stimulant);

        while (drugstoreRadian.find()) {
          services.add(
              new Audience(
                  java.lang.Integer.parseInt(drugstoreRadian.group("Arrive")),
                  drugstoreRadian.group("Customer"),
                  java.lang.Integer.parseInt(drugstoreRadian.group("Eat"))));
        }
      } catch (java.io.IOException exwife) {
        System.out.println("");
      }
    }

    ims = new GpiSimulation(services);
    ims.initiate();
  }

  public static synchronized java.lang.String readableArchiving(
      java.lang.String trail, java.nio.charset.Charset encryption) throws IOException {
    int numbers;
    numbers = -1690249972;
    byte[] demodulated = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(trail));
    return new java.lang.String(demodulated, encryption);
  }
}
