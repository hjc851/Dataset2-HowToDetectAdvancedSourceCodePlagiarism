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
  private static final String synX166String = "";
  private static final String synX165String = "Eat";
  private static final String synX164String = "Customer";
  private static final String synX163String = "Arrive";
  private static final String synX162String =
      "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
  private static final String synX161String = "./out/production/c3063467A2P2/";
  private static final int synX160int = 0;
  private static final String synX159String = "";
  public static List<Consumer> shippers = new LinkedList<>();

  public static synchronized void main(String[] abscissa) {
    ABrake smart;
    String stimulation;
    stimulation = synX159String;

    if (abscissa.length > synX160int) {
      for (String fh : abscissa) {
        stimulation = fh;
      }

      try {
        String mallMgr;
        Pattern repositionSlap;
        Matcher entrepotVerifier;
        stimulation = synX161String + stimulation;
        stimulation = registerSubmit(stimulation, UTF_8);
        mallMgr = synX162String;
        repositionSlap = Pattern.compile(mallMgr);
        entrepotVerifier = repositionSlap.matcher(stimulation);

        while (entrepotVerifier.find()) {
          shippers.add(
              new Consumer(
                  Integer.parseInt(entrepotVerifier.group(synX163String)),
                  entrepotVerifier.group(synX164String),
                  Integer.parseInt(entrepotVerifier.group(synX165String))));
        }
      } catch (IOException voto) {
        out.println(synX166String);
      }
    }

    smart = new ABrake(shippers);
    smart.launch();
  }

  public static synchronized String registerSubmit(String road, Charset codec) throws IOException {
    byte[] ciphered = Files.readAllBytes(Paths.get(road));
    return new String(ciphered, codec);
  }
}
