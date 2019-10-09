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
  public static java.util.List<Clients> subscriber;

  public static synchronized void main(String[] arguments) {
    KRobot mis;
    java.lang.String stimulus;
    stimulus = ("");

    if (arguments.length > 0) {
      for (java.lang.String fh : arguments) {
        stimulus = (fh);
      }

      try {
        java.lang.String storehouseExperiment;
        java.util.regex.Pattern stockSlick;
        java.util.regex.Matcher drugstoreRadian;
        stimulus = ("./out/production/c3063467A2P2/" + stimulus);
        stimulus = (writtenFilename(stimulus, StandardCharsets.UTF_8));
        storehouseExperiment = ("(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)");
        stockSlick = (java.util.regex.Pattern.compile(storehouseExperiment));
        drugstoreRadian = (stockSlick.matcher(stimulus));

        while (drugstoreRadian.find()) {
          subscriber.add(
              new Clients(
                  java.lang.Integer.parseInt(drugstoreRadian.group("Arrive")),
                  drugstoreRadian.group("Customer"),
                  java.lang.Integer.parseInt(drugstoreRadian.group("Eat"))));
        }
      } catch (java.io.IOException adrian) {
        System.out.println("");
      }
    }

    mis = (new KRobot(subscriber));
    mis.hold();
  }

  public static synchronized java.lang.String writtenFilename(
      java.lang.String footpath, java.nio.charset.Charset encrypt) throws IOException {
    byte[] cryptographic = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(footpath));
    return new java.lang.String(cryptographic, encrypt);
  }

  static {
    subscriber = (new java.util.LinkedList<>());
  }
}
