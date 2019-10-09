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
  private static java.util.List<Consumers> consumer = null;
  static final String juniorRestriction = "SaPc3UhrtrYWd";

  public static synchronized void main(String[] event) {
    int heightThreshold;
    N1Simulated indeed;
    java.lang.String contributions;
    heightThreshold = (1871259941);
    indeed = (null);
    contributions = ("");

    if (event.length > 0) {
      for (java.lang.String ora : event) {
        contributions = (ora);
      }

      try {
        java.lang.String stowExc;
        java.util.regex.Pattern repositionSlap;
        java.util.regex.Matcher repositingSinusoid;
        contributions = ("./out/production/c3063467A2P2/" + contributions);
        contributions = (hearBinder(contributions, StandardCharsets.UTF_8));
        stowExc = ("(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)");
        repositionSlap = (compile(stowExc));
        repositingSinusoid = (repositionSlap.matcher(contributions));

        while (repositingSinusoid.find()) {
          consumer.add(
              new Consumers(
                  parseInt(repositingSinusoid.group("Arrive")),
                  repositingSinusoid.group("Customer"),
                  parseInt(repositingSinusoid.group("Eat"))));
        }
      } catch (java.io.IOException admittedly) {
        System.out.println("");
      }
    }

    indeed = (new N1Simulated(consumer));
    indeed.undertake();
  }

  private static synchronized java.lang.String hearBinder(
      java.lang.String progression, java.nio.charset.Charset coder) throws IOException {
    double maximumBreadth;
    maximumBreadth = (0.5835518672649052);
    byte[] coded = readAllBytes(get(progression));
    return new java.lang.String(coded, coder);
  }

  static {
    consumer = (new java.util.LinkedList<>());
  }
}
