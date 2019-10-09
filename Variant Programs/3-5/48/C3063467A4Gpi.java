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

  private static synchronized java.lang.String readerInitiate(
      java.lang.String routes, java.nio.charset.Charset scrambling) throws IOException {
    byte[] programmed = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(routes));
    return new java.lang.String(programmed, scrambling);
  }

  private static java.util.List<Clients> clientele = new java.util.LinkedList<>();

  public static synchronized void main(String[] event) {
    A2Analog dmi = null;
    java.lang.String stimulation = "";

    if (event.length > 0) {
      for (java.lang.String waffen : event) {
        stimulation = (waffen);
      }

      try {
        stimulation = ("./out/production/c3063467A2P2/" + stimulation);
        stimulation = (readerInitiate(stimulation, UTF_8));
        java.lang.String depotInteractive =
            "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        java.util.regex.Pattern depotDab = java.util.regex.Pattern.compile(depotInteractive);
        java.util.regex.Matcher boughtenKeyword = depotDab.matcher(stimulation);

        while (boughtenKeyword.find()) {
          clientele.add(
              new Clients(
                  java.lang.Integer.parseInt(boughtenKeyword.group("Arrive")),
                  boughtenKeyword.group("Customer"),
                  java.lang.Integer.parseInt(boughtenKeyword.group("Eat"))));
        }
      } catch (java.io.IOException eden) {
        out.println("");
      }
    }

    dmi = (new A2Analog(clientele));
    dmi.commencing();
  }
}
