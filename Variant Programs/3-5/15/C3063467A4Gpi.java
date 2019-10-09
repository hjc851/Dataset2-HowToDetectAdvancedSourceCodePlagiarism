import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class C3063467A4Gpi {
  private static final double synX212double = 0.8284212272501211;
  private static final String synX211String = "";
  private static final String synX210String = "Eat";
  private static final String synX209String = "Customer";
  private static final String synX208String = "Arrive";
  private static final String synX207String =
      "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
  private static final String synX206String = "./out/production/c3063467A2P2/";
  private static final int synX205int = 0;
  private static final String synX204String = "";
  private static final int synX203int = -549201181;
  public static final double prices = 0.217786154535197;
  public static java.util.List<Patient> services;

  public static synchronized void main(String[] specified) {
    int restrain = synX203int;
    KRobot ism;
    java.lang.String contributions = synX204String;

    if (specified.length > synX205int) {
      for (java.lang.String waffen : specified) {
        contributions = waffen;
      }

      try {
        contributions = synX206String + contributions;
        contributions = interpretLodge(contributions, StandardCharsets.UTF_8);
        java.lang.String repositionEquiv = synX207String;
        java.util.regex.Pattern stockSlick = compile(repositionEquiv);
        java.util.regex.Matcher entrepotVerifier = stockSlick.matcher(contributions);

        while (entrepotVerifier.find()) {
          services.add(
              new Patient(
                  parseInt(entrepotVerifier.group(synX208String)),
                  entrepotVerifier.group(synX209String),
                  parseInt(entrepotVerifier.group(synX210String))));
        }
      } catch (java.io.IOException admittedly) {
        System.out.println(synX211String);
      }
    }

    ism = new KRobot(services);
    ism.take();
  }

  public static synchronized java.lang.String interpretLodge(
      java.lang.String trajectory, java.nio.charset.Charset uncompressed) throws IOException {
    double tally = synX212double;
    byte[] stored = readAllBytes(get(trajectory));
    return new java.lang.String(stored, uncompressed);
  }

  static {
    services = new java.util.LinkedList<>();
  }
}
