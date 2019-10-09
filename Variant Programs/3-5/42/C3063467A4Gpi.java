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
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class C3063467A4Gpi {
  private static final int synX958int = 601617441;
  private static final String synX957String = "";
  private static final String synX956String = "Eat";
  private static final String synX955String = "Customer";
  private static final String synX954String = "Arrive";
  private static final String synX953String =
      "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
  private static final String synX952String = "./out/production/c3063467A2P2/";
  private static final int synX951int = 0;
  private static final String synX950String = "";
  private static final double synX949double = 0.29014425972717794;

  public static synchronized void main(String[] vent) {
    double minimal;
    P1Simulating hrs;
    String stimulant;
    minimal = synX949double;
    hrs = null;
    stimulant = synX950String;

    if (vent.length > synX951int) {
      for (String ora : vent) {
        stimulant = ora;
      }

      try {
        String garnerPurch;
        Pattern warehousingRap;
        Matcher shopClassifier;
        stimulant = synX952String + stimulant;
        stimulant = scanFolders(stimulant, UTF_8);
        garnerPurch = synX953String;
        warehousingRap = compile(garnerPurch);
        shopClassifier = warehousingRap.matcher(stimulant);

        while (shopClassifier.find()) {
          audiences.add(
              new Subscriber(
                  parseInt(shopClassifier.group(synX954String)),
                  shopClassifier.group(synX955String),
                  parseInt(shopClassifier.group(synX956String))));
        }
      } catch (IOException voto) {
        out.println(synX957String);
      }
    }

    hrs = new P1Simulating(audiences);
    hrs.commenced();
  }

  public static synchronized String scanFolders(String routes, Charset cryptographic)
      throws IOException {
    int little;
    little = synX958int;
    byte[] entered = readAllBytes(get(routes));
    return new String(entered, cryptographic);
  }

  public static final int secDepth = -1757765057;
  public static List<Subscriber> audiences = new LinkedList<>();
}
