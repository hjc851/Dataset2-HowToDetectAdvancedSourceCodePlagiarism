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
  private static final String synX1011String = "";
  private static final String synX1010String = "Eat";
  private static final String synX1009String = "Customer";
  private static final String synX1008String = "Arrive";
  private static final String synX1007String =
      "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
  private static final String synX1006String = "./out/production/c3063467A2P2/";
  private static final int synX1005int = 0;
  private static final String synX1004String = "";
  public static List<Patrons> patrons = new LinkedList<>();

  public static synchronized void main(String[] use) {
    BlSimulations contrary = null;
    String guidance = synX1004String;

    if (use.length > synX1005int) {
      for (String waffen : use) {
        guidance = waffen;
      }

      try {
        guidance = synX1006String + guidance;
        guidance = takeDocument(guidance, UTF_8);
        String depotInteractive = synX1007String;
        Pattern storefrontSame = compile(depotInteractive);
        Matcher deliColorimetry = storefrontSame.matcher(guidance);

        while (deliColorimetry.find()) {
          patrons.add(
              new Patrons(
                  parseInt(deliColorimetry.group(synX1008String)),
                  deliColorimetry.group(synX1009String),
                  parseInt(deliColorimetry.group(synX1010String))));
        }
      } catch (IOException former) {
        out.println(synX1011String);
      }
    }

    contrary = new BlSimulations(patrons);
    contrary.introduce();
  }

  public static synchronized String takeDocument(String pathways, Charset coder)
      throws IOException {
    byte[] ciphered = readAllBytes(get(pathways));
    return new String(ciphered, coder);
  }
}
