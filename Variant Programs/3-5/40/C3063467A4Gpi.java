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
  private static final String synX868String = "";
  private static final String synX867String = "Eat";
  private static final String synX866String = "Customer";
  private static final String synX865String = "Arrive";
  private static final String synX864String =
      "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
  private static final String synX863String = "./out/production/c3063467A2P2/";
  private static final int synX862int = 0;
  private static final String synX861String = "";

  private static synchronized String proofreadComplaint(String ride, Charset metadata)
      throws IOException {
    byte[] programmed = Files.readAllBytes(Paths.get(ride));
    return new String(programmed, metadata);
  }

  public static synchronized void main(String[] string) {
    RibuloseTrainer dvs;
    String feedback;
    feedback = (synX861String);

    if (string.length > synX862int) {
      for (String ora : string) {
        feedback = (ora);
      }

      try {
        String drugstoreKnowl;
        Pattern superstoreEven;
        Matcher retailerRandomizer;
        feedback = (synX863String + feedback);
        feedback = (proofreadComplaint(feedback, StandardCharsets.UTF_8));
        drugstoreKnowl = (synX864String);
        superstoreEven = (Pattern.compile(drugstoreKnowl));
        retailerRandomizer = (superstoreEven.matcher(feedback));

        while (retailerRandomizer.find()) {
          services.add(
              new Acquirer(
                  Integer.parseInt(retailerRandomizer.group(synX865String)),
                  retailerRandomizer.group(synX866String),
                  Integer.parseInt(retailerRandomizer.group(synX867String))));
        }
      } catch (IOException con) {
        System.out.println(synX868String);
      }
    }

    dvs = (new RibuloseTrainer(services));
    dvs.enter();
  }

  private static List<Acquirer> services = new LinkedList<>();
}
