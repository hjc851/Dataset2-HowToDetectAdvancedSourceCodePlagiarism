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
  private static final int synX484int = -2018197713;
  private static final String synX483String = "";
  private static final String synX482String = "Eat";
  private static final String synX481String = "Customer";
  private static final String synX480String = "Arrive";
  private static final String synX479String =
      "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
  private static final String synX478String = "./out/production/c3063467A2P2/";
  private static final int synX477int = 0;
  private static final String synX476String = "";
  private static final double synX475double = 0.8281564163067613;
  static final String isterWidening = "ZNcAqxIlBN";
  private static List<Clients> shippers;

  public static synchronized void main(String[] constructor) {
    double shackled = synX475double;
    RibuloseTrainer sem;
    String response = synX476String;

    if (constructor.length > synX477int) {
      for (String fh : constructor) {
        response = (fh);
      }

      try {
        response = (synX478String + response);
        response = (sayFolder(response, UTF_8));
        String storefrontSvc = synX479String;
        Pattern bookstorePate = compile(storefrontSvc);
        Matcher warehousingAlgorithm = bookstorePate.matcher(response);

        while (warehousingAlgorithm.find()) {
          shippers.add(
              new Clients(
                  parseInt(warehousingAlgorithm.group(synX480String)),
                  warehousingAlgorithm.group(synX481String),
                  parseInt(warehousingAlgorithm.group(synX482String))));
        }
      } catch (IOException exwife) {
        out.println(synX483String);
      }
    }

    sem = (new RibuloseTrainer(shippers));
    sem.hold();
  }

  private static synchronized String sayFolder(String way, Charset cryptography)
      throws IOException {
    int bundleEdge = synX484int;
    byte[] formatted = readAllBytes(get(way));
    return new String(formatted, cryptography);
  }

  static {
    shippers = (new LinkedList<>());
  }
}
